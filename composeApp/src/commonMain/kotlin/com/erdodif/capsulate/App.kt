package com.erdodif.capsulate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.erdodif.capsulate.pages.screen.DebugPresenter
import com.erdodif.capsulate.pages.screen.EditorPresenter
import com.erdodif.capsulate.pages.screen.LandingScreen
import com.erdodif.capsulate.pages.screen.LandingPresenter
import com.erdodif.capsulate.pages.screen.PresetPresenter
import com.erdodif.capsulate.pages.screen.ProjectPresenter
import com.erdodif.capsulate.pages.ui.DebugPage
import com.erdodif.capsulate.pages.ui.EditorPage
import com.erdodif.capsulate.pages.ui.LandingPage
import com.erdodif.capsulate.pages.ui.PresetPage
import com.erdodif.capsulate.pages.ui.ProjectPage
import com.erdodif.capsulate.structogram.composables.Theme
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.Circuit
import com.slack.circuit.foundation.CircuitCompositionLocals
import com.slack.circuit.foundation.NavigableCircuitContent
import com.slack.circuit.foundation.internal.BackHandler
import com.slack.circuit.foundation.rememberCircuitNavigator
import com.slack.circuit.runtime.screen.Screen
import kotlinx.coroutines.Job
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

val applicationExitJob = Job()

@Composable
@Preview
fun App() {
    val backStack = rememberSaveableBackStack(root = LandingScreen)
    val navigator = rememberCircuitNavigator(backStack) {
        applicationExitJob.complete()
    }
    BackHandler(true, navigator::pop)
    val circuit = Circuit.Builder()
        .addPresenterFactory(LandingPresenter.Factory)
        .addUiFactory(LandingPage.Factory)
        .addPresenterFactory(ProjectPresenter.Factory)
        .addUiFactory(ProjectPage.Factory)
        .addPresenterFactory(PresetPresenter.Factory)
        .addUiFactory(PresetPage.Factory)
        .addPresenterFactory(EditorPresenter.Factory)
        .addUiFactory(EditorPage.Factory)
        .addPresenterFactory(DebugPresenter.Factory)
        .addUiFactory(DebugPage.Factory)
        .build()
    MaterialTheme(colorScheme = resolveColors()) {
        Theme.initialize()
        Surface(Modifier.fillMaxSize()) {
            Column(
                Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.background),
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
