package com.erdodif.capsulate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.erdodif.capsulate.lang.grammar.Statement
import com.erdodif.capsulate.pages.EmptyPage
import com.erdodif.capsulate.pages.EmptyScreen
import com.erdodif.capsulate.pages.EmptyScreenPresenter
import com.erdodif.capsulate.pages.ProjectPage
import com.erdodif.capsulate.pages.ProjectPresenter
import com.erdodif.capsulate.pages.ProjectScreen
import com.erdodif.capsulate.structogram.composables.Theme
import com.mohamedrejeb.compose.dnd.DragAndDropContainer
import com.mohamedrejeb.compose.dnd.DragAndDropState
import com.mohamedrejeb.compose.dnd.rememberDragAndDropState
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.Circuit
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.rememberCircuitNavigator
import com.slack.circuit.runtime.screen.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

val defaultScreenError: @Composable (Screen, Modifier) -> Unit = { screen, modifier ->
    Column(modifier, verticalArrangement = Arrangement.Center) {
        Text(
            "Asked screen unreachable ($screen)",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(MaterialTheme.colorScheme.errorContainer)
                .padding(10.dp),
            MaterialTheme.colorScheme.error
        )
    }
}

val globalDragState: CompositionLocal<DragAndDropState<Statement>> =
    compositionLocalOf { DragAndDropState() }

@Composable
@Preview
fun App() {
    val backStack = rememberSaveableBackStack(root = EmptyScreen)
    val navigator = rememberCircuitNavigator(backStack) {
        //Last page is popped, time to exit the app
    }
    val circuit = Circuit.Builder()
        .addPresenterFactory(EmptyScreenPresenter.Factory)
        .addUi<EmptyScreen, EmptyScreen.State> { state, modifier -> EmptyPage(state, modifier) }
        .addPresenterFactory(ProjectPresenter.Factory)
        .addUi<ProjectScreen, ProjectScreen.State> { state, modifier ->
            ProjectPage.Content(state, modifier)
        }
        .build()
    MaterialTheme(colorScheme = resolveColors()) {
        Theme.initialize()
        DragAndDropContainer(globalDragState.current) {
            Column(
                Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primaryContainer),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircuitCompositionLocals(circuit) {
                    NavigableCircuitContent(
                        navigator = navigator,
                        backStack = backStack,
                        modifier = Modifier.fillMaxSize(),
                        unavailableRoute = defaultScreenError
                    )
                }
            }
        }
    }
}
