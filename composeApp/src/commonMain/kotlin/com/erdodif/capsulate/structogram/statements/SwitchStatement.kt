package com.erdodif.capsulate.structogram.statements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.erdodif.capsulate.structogram.composables.HorizontalBorder
import com.erdodif.capsulate.structogram.composables.StackWithSeparator
import com.erdodif.capsulate.structogram.composables.StatementText
import com.erdodif.capsulate.structogram.composables.Theme
import com.erdodif.capsulate.structogram.composables.VerticalBorder
import com.erdodif.capsulate.structogram.composables.caseIndicator
import com.erdodif.capsulate.structogram.composables.elseIndicator
import com.erdodif.capsulate.utility.dim
import com.erdodif.capsulate.utility.onDpSize

open class SwitchStatement(
    var blocks: Array<Block>,
    statement: com.erdodif.capsulate.lang.grammar.Statement
) : Statement(statement) {
// TODO: Needs to be a Layout, because the measurement phase can fix the one frame lag on resize
// also, merge the two functions please

    @Composable
    override fun Show(modifier: Modifier, draggable: Boolean) {
        var size by remember { mutableStateOf(DpSize.Zero) }
        val density = LocalDensity.current
        Row(modifier.height(IntrinsicSize.Min).onDpSize(density) { size = it }) {
            var maxHeight by remember { mutableStateOf(0.dp) }
            StackWithSeparator(blocks, {
                Column(Modifier.weight(1f, true)) {
                    DraggableArea(Modifier, draggable, size) { dragging ->
                        Row(Modifier.dim(dragging)) {
                            StatementText(
                                it.condition,
                                modifier = Modifier.caseIndicator().fillMaxWidth().padding(
                                    Theme.casePadding
                                ).onSizeChanged {
                                    maxHeight = max(maxHeight, it.height.dp)
                                }
                            )
                        }
                    }
                    HorizontalBorder()
                    StackWithSeparator(it.statements, {
                        it.Show(Modifier.fillMaxWidth(), draggable)
                    }
                    ) { HorizontalBorder() }
                }
            }) { VerticalBorder() }
        }
    }
}

class SwitchStatementWithElse(
    blocks: Array<Block>,
    var elseBranch: StatementList,
    statement: com.erdodif.capsulate.lang.grammar.Statement
) :
    SwitchStatement(blocks, statement) {
    @Composable
    override fun Show(modifier: Modifier, draggable: Boolean) {
        var size by remember { mutableStateOf(DpSize.Zero) }
        val density = LocalDensity.current
        Row(
            modifier.clip(RectangleShape).fillMaxWidth().height(IntrinsicSize.Min)
                .onDpSize(density) { size = it }) {
            var maxHeight by remember { mutableStateOf(0.dp) }
            StackWithSeparator(blocks, {
                Column(Modifier.weight(1f, true)) {
                    DraggableArea(Modifier, draggable, size) { dragging ->
                        Row(Modifier.dim(dragging)) {
                            StatementText(
                                it.condition, modifier = Modifier
                                    .onSizeChanged {
                                        maxHeight = max(
                                            maxHeight,
                                            (it.height.toFloat() / density.density).dp
                                        )
                                    }
                                    .caseIndicator()
                                    .fillMaxWidth()
                                    .defaultMinSize(minHeight = maxHeight)
                                    .padding(Theme.casePadding)
                            )
                        }
                    }
                    HorizontalBorder()
                    StackWithSeparator(it.statements, {
                        it.Show(Modifier.fillMaxWidth(), draggable)
                    }
                    ) { HorizontalBorder() }
                }
            }) { VerticalBorder() }
            VerticalBorder()
            Column(Modifier.weight(1f, true)) {
                DraggableArea(Modifier, draggable, size) { dragging ->
                    Row(Modifier.dim(dragging)) {
                        StatementText(
                            "", modifier = Modifier
                                .onSizeChanged {
                                    maxHeight =
                                        max(maxHeight, (it.height.toFloat() / density.density).dp)
                                }
                                .elseIndicator()
                                .fillMaxWidth()
                                .defaultMinSize(minHeight = maxHeight)
                                .padding(Theme.elsePadding)
                        )
                    }
                }
                HorizontalBorder()
                StackWithSeparator(elseBranch, {
                    it.Show(Modifier.fillMaxWidth(), draggable)
                }
                ) { HorizontalBorder() }
            }
        }
    }
}

open class Block(var condition: String, var statements: StatementList = arrayOf())
