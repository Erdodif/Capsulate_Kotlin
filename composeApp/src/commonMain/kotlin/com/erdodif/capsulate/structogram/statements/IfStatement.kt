package com.erdodif.capsulate.structogram.statements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.erdodif.capsulate.lang.grammar.If
import com.erdodif.capsulate.lang.util.ParserState
import com.erdodif.capsulate.structogram.composables.HorizontalBorder
import com.erdodif.capsulate.structogram.composables.StackWithSeparator
import com.erdodif.capsulate.structogram.composables.StatementText
import com.erdodif.capsulate.structogram.composables.Theme
import com.erdodif.capsulate.structogram.composables.VerticalBorder
import com.erdodif.capsulate.structogram.composables.caseIndicator
import com.erdodif.capsulate.structogram.composables.elseIndicator
import com.erdodif.capsulate.utility.onDpSize

open class IfStatement(
    var condition: String,
    var trueBranch: StatementList = arrayOf(),
    var falseBranch: StatementList = arrayOf(),
    statement: com.erdodif.capsulate.lang.grammar.Statement
) : Statement(statement) {
    constructor(statement: If, state: ParserState) : this(
        statement.condition.toString(state),
        statement.statementsTrue.map { fromStatement(state, it) }.toTypedArray(),
        statement.statementsFalse.map { fromStatement(state, it) }.toTypedArray(),
        statement
    )

    @Composable
    override fun Show(modifier: Modifier, draggable: Boolean) {
        var size by remember { mutableStateOf(DpSize.Zero) }
        val density = LocalDensity.current
        Column(
            modifier.onDpSize(density) { size = it }.clip(RectangleShape).fillMaxWidth()
        ) {
            DraggableArea(Modifier, draggable, size) {
                StatementText(
                    condition,
                    modifier = Modifier.fillMaxWidth().caseIndicator().elseIndicator()
                        .padding(Theme.ifPadding)
                )
            }
            HorizontalBorder()
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.height(IntrinsicSize.Min)
                    .background(MaterialTheme.colorScheme.primary).fillMaxWidth()
            ) {
                Column(
                    Modifier.fillMaxHeight().weight(1f, true).background(
                        MaterialTheme.colorScheme.primary
                    )
                ) {
                    StackWithSeparator(trueBranch, {
                        it.Show(Modifier.fillMaxWidth(), draggable)
                    }) { HorizontalBorder() }
                }
                VerticalBorder()
                Column(
                    Modifier.fillMaxHeight().weight(1f, true).background(
                        MaterialTheme.colorScheme.primary
                    )
                ) {
                    StackWithSeparator(
                        falseBranch,
                        {
                            it.Show(
                                Modifier.fillMaxWidth(),
                                draggable
                            )
                        }) { HorizontalBorder() }
                }
            }

        }
    }
}
