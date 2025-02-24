package com.erdodif.capsulate.pages.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.erdodif.capsulate.KParcelize
import com.erdodif.capsulate.pages.screen.ProjectScreen.Event
import com.erdodif.capsulate.project.OpenFile
import com.erdodif.capsulate.project.Project
import com.erdodif.capsulate.utility.saver.mutableSaverOf
import com.erdodif.capsulate.utility.screenPresenterFactory
import com.erdodif.capsulate.utility.saver.stateListSaver
import com.erdodif.capsulate.utility.saver.OpenFileSaver
import com.slack.circuit.backstack.SaveableBackStack
import com.slack.circuit.backstack.rememberSaveableBackStack
import com.slack.circuit.foundation.rememberCircuitNavigator
import com.slack.circuit.retained.rememberRetained
import com.slack.circuit.runtime.CircuitUiEvent
import com.slack.circuit.runtime.CircuitUiState
import com.slack.circuit.runtime.Navigator
import com.slack.circuit.runtime.presenter.Presenter
import com.slack.circuit.runtime.screen.Screen
import io.github.vinceglb.filekit.core.PlatformDirectory

@KParcelize
data class ProjectScreen(val project: Project) : Screen {
    class State(
        val project: Project,
        val opened: OpenFile,
        val editorNavigator: Navigator,
        val editorBackStack: SaveableBackStack,
        val eventHandler: (Event) -> Unit
    ) : CircuitUiState

    sealed interface Event : CircuitUiEvent {
        data class ProjectSelected(val path: PlatformDirectory) : Event
        data object Close : Event
        data class OpenAFile(val name: String) : Event
        data class OpenN(val index: Int) : Event
        data object New : Event
    }
}

class ProjectPresenter(
    private val screen: ProjectScreen,
    private val navigator: Navigator
) : Presenter<ProjectScreen.State> {
    object Factory : Presenter.Factory by screenPresenterFactory<ProjectScreen>(::ProjectPresenter)

    @Composable
    override fun present(): ProjectScreen.State {
        // the backstack and the state must point to the same object or else the navigation breaks
        val init = remember { screen.project.openFiles.firstOrNull() ?: OpenFile() }
        var path by rememberRetained { mutableStateOf(screen.project.directory) }
        var opened by rememberSaveable(saver = mutableSaverOf(OpenFileSaver)) { mutableStateOf(init) }
        val openFiles = rememberSaveable(saver = stateListSaver<OpenFile>()) { mutableStateListOf<OpenFile>() }
        val backStack = rememberSaveableBackStack(root = EditorScreen(init) {})
        val editorNavigator = rememberCircuitNavigator(backStack, navigator::pop)
        val project = Project(screen.project.directory, openFiles)
        return ProjectScreen.State(project, opened, editorNavigator, backStack) { event ->
            when (event) {
                is Event.ProjectSelected -> path = event.path
                is Event.Close -> navigator.pop()
                is Event.OpenAFile -> {
                    opened = project.getFile(event.name)
                    editorNavigator.resetRoot(EditorScreen(project.getFile(event.name), {opened = it}))
                }

                is Event.New -> {
                    opened = OpenFile()
                    openFiles.add(opened)
                    editorNavigator.resetRoot(EditorScreen(opened, {opened = it}))
                }

                is Event.OpenN -> {
                    opened = project.openFiles[event.index]
                    editorNavigator.resetRoot(EditorScreen(opened,{opened = it}))
                }
            }
        }
    }

}

