package com.erdodif.capsulate.structogram.statements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.erdodif.capsulate.structogram.composables.HorizontalBorder
import com.erdodif.capsulate.structogram.composables.StackWithSeparator
import com.erdodif.capsulate.structogram.composables.StatementText
import com.erdodif.capsulate.structogram.composables.Theme
import com.erdodif.capsulate.structogram.composables.VerticalBorder
import com.erdodif.capsulate.structogram.composables.caseIndicator
import com.erdodif.capsulate.structogram.composables.elseIndicator

open class IfStatement(
    var condition: String,
    var trueBranch: StatementList = arrayOf(),
    var falseBranch: StatementList = arrayOf()
) : Statement() {
    @Composable
    override fun show(modifier: Modifier) = Column(modifier.fillMaxWidth()) {
        StatementText(
            condition,
            modifier = Modifier.fillMaxWidth().caseIndicator().elseIndicator()
                .padding(Theme.ifPadding)
        )
        HorizontalBorder()
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.height(IntrinsicSize.Min)
        ) {
            Column(Modifier.height(IntrinsicSize.Max).width(IntrinsicSize.Min)) {
                StackWithSeparator(trueBranch, { it.show() }) { HorizontalBorder() }
            }
            VerticalBorder()
            Column(Modifier.height(IntrinsicSize.Max).width(IntrinsicSize.Min)) {
                StackWithSeparator(falseBranch, { it.show() }) { HorizontalBorder() }
            }
        }
    }
}