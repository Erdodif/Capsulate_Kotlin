package com.erdodif.capsulate.lang.grammar

import com.erdodif.capsulate.lang.util.Either
import com.erdodif.capsulate.lang.util.Env
import com.erdodif.capsulate.lang.util.Parser
import com.erdodif.capsulate.lang.util.ParserResult
import com.erdodif.capsulate.lang.util.ParserState
import com.erdodif.capsulate.lang.util._anyKeyword
import com.erdodif.capsulate.lang.util._char
import com.erdodif.capsulate.lang.util._keyword
import com.erdodif.capsulate.lang.util._lineBreak
import com.erdodif.capsulate.lang.util._lineEnd
import com.erdodif.capsulate.lang.util._nonKeyword
import com.erdodif.capsulate.lang.util.asString
import com.erdodif.capsulate.lang.util.asum
import com.erdodif.capsulate.lang.util.div
import com.erdodif.capsulate.lang.util.freeChar
import com.erdodif.capsulate.lang.util.get
import com.erdodif.capsulate.lang.util.reservedChar
import com.erdodif.capsulate.lang.util.times
import com.erdodif.capsulate.lang.util.tok
import com.erdodif.capsulate.specification.Type

fun <T> delimit(parser: Parser<T>): Parser<T> =
    left(parser, many(_lineEnd))

/**
 * Allows tokenized line ends to jump to next statement
 */
fun <T> newLined(parser: Parser<T>): Parser<T> =
    left(parser, many(_lineBreak))

val nonParallel: Parser<Statement> = {
    asum(
        sSkip,
        sAbort,
        sWait,
        sReturn,
        sAssign,
        sSelect,
        sParallelAssign,
        sWhen,
        sIf,
        sWhile,
        sDoWhile,
        sExpression
    )()
}

val statement: Parser<Statement> = { orEither(sParallel, nonParallel)() }

val blockOrParallel: Parser<ArrayList<Statement>> = {
    orEither(
        newLined(sParallel) / { arrayListOf(it) },
        orEither(
            (newLined(_char('{')) + newLined(_char('}'))) / { arrayListOf() },
            middle(newLined(_char('{')), some(delimit(statement)), newLined(_char('}')))
        )
    )()
}

val statementOrBlock: Parser<ArrayList<Statement>> =
    orEither(blockOrParallel, nonParallel / { arrayListOf(it) })

val program: Parser<ArrayList<Statement>> =
    {
        right(
            many(_lineEnd),
            orEither(
                delimited(statement, some(_lineBreak)),
                newLined(statement) / { arrayListOf(it) }
            ))()
    }

val sError: Parser<LineError> =
    delimit(some(satisfy { it !in lineEnd })) / { LineError(it.asString()) }

val sSkip: Parser<Statement> = delimit(_keyword("skip")) / { Skip }
val sAbort: Parser<Statement> = delimit(_keyword("abort") / { Abort })

val sWait: Parser<Statement> = delimit(right(_keyword("wait"), pExp) / { Wait(it) })
val sReturn: Parser<Statement> = delimit(right(_keyword("return"), pExp) / { Return(it) })

val sExpression: Parser<Statement> = delimit(pExp) / { Expression(it) }

val sIf: Parser<Statement> = (right(_keyword("if"), delimit(pExp) + blockOrParallel) +
        right(delimit(_keyword("else")), blockOrParallel)) /
        { If(it.first.first, it.first.second, it.second) }

val sWhen: Parser<Statement> = (middle(
    newLined(_keyword("when")) + newLined(_char('{')),
    (many(
        left(
            left(pExp, newLined(_char(':'))) + statementOrBlock,
            newLined(_char(','))
        )
    ) + optional(left(pExp, newLined(_char(':'))) + statementOrBlock))
            + optional(
        middle(
            newLined(_keyword("else") + _char(':')),
            statementOrBlock,
            optional(newLined(_char(',')))
        )
    ),
    newLined(_char('}'))
)) / {
    if (it.first.second != null) it.first.first.add(it.first.second!!); When(
    it.first.first,
    it.second
)
}

val sWhile: Parser<Statement> =
    (middle(_keyword("while"), pExp, many(_char('\n'))) + blockOrParallel) /
            { While(it.first, it.second) }

val sDoWhile: Parser<Statement> = right(
    _keyword("do") + many(_char('\n')),
    blockOrParallel + delimit(right(_keyword("while"), pExp))
) / {
    DoWhile(it.second, it.first)
}

val sParallelAssign: Parser<Statement> =
    (delimited(_nonKeyword, _char(',')) + right(
        tok(string(":=")),
        delimit(delimited(pExp, _char(',')))
    ))[{
        if (it.value.second.size != it.value.first.size) {
            fail(
                "The number of parameters does not match the number of values to assign."
            )
        } else pass(
            it.match.start, ParallelAssign(it.value.first.zip(it.value.second) as ArrayList)
        )
    }]

val sAssign: Parser<Statement> = delimit(_nonKeyword + right(_keyword(":="), pExp)) / {
    Assign(it.first, it.second)
}

val pType: Parser<Type> = { pass(0, Type.NEVER) } // TODO :get from specification part
val sSelect: Parser<Statement> = delimit(_nonKeyword + right(_keyword(":∈"), pType)) / {
    Select(it.first, it.second)
}

val halfProgram: Parser<ArrayList<Either<Statement, LineError>>> = {
    orEither(
        topLevel(many(right(many(_lineEnd), or(statement, sError)))),
        topLevel(many(_lineEnd) / { arrayListOf() })
    )()
}

val sParallel: Parser<Statement> = {
    (delimited2(
        middle(
            newLined(_char('{')),
            many(delimit(statement)),
            newLined(_char('}'))
        ),
        _char('|') + many(_lineBreak)
    ) / { Parallel(it) as Statement })()
}

class ParseException(reason: String) : Exception(reason)

fun parseProgram(input: String): ParserResult<ArrayList<Statement>> =
    ParserState(input).parse(topLevel(program))

@Suppress("UNCHECKED_CAST")
fun tokenizeProgram(input: String): ParserResult<ArrayList<Token>> =
    ParserState(input).parse(
        topLevel(
            many(
                asum(
                    (_lineEnd * { it, pos -> LineEnd(it, pos) }) as Parser<Token>,
                    pVariable as Parser<Token>,
                    pComment as Parser<Token>,
                    pIntLit as Parser<Token>,
                    pBoolLit as Parser<Token>,
                    pStrLit as Parser<Token>,
                    (_anyKeyword * { it, pos -> KeyWord(it, pos) }) as Parser<Token>,
                    (tok(reservedChar) * { it, pos -> Symbol(it, pos) }) as Parser<Token>,
                    (tok(some(freeChar)) * { _, pos -> Token(pos) })
                )
            )
        )
    )


fun Env.runProgram(statements: ArrayList<Statement>) {
    for (statement in statements) statement.evaluate(this)
}
