package components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import dev.kilua.core.ComponentBase
import dev.kilua.html.div
import dev.kilua.html.p
import dev.kilua.html.unaryPlus
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class CounterState(val count: Int = 0)

class CounterViewModel {
    private val _counter = MutableStateFlow(CounterState())
    val counter = _counter.asStateFlow()

    fun increment() {
        _counter.update { it.copy(count = it.count + 1) }
    }

    fun decrement() {
        _counter.update { it.copy(count = it.count - 1) }
    }

    fun reset() {
        _counter.update { it.copy(count = 0) }
    }
}

@Composable
fun ComponentBase.counter() {
    val viewModel = CounterViewModel()
    val counter by viewModel.counter.collectAsState()

    div {
        p { +"The value of count is ${counter.count}" }
        div {
            btnBootstrap(
                label = "Decrement",
                onBtnClick = { viewModel.decrement() }
            )
            btnBootstrap(
                label = "Reset",
                onBtnClick = { viewModel.reset() }
            )
            btnBootstrap(
                label = "Increment",
                extraClasses = "btn-lg",
                onBtnClick = { viewModel.increment() }
            )
        }
    }
}