package components

import androidx.compose.runtime.Composable
import dev.kilua.core.ComponentBase
import dev.kilua.html.button

enum class BootstrapButtonType {
    PRIMARY, SECONDARY, SUCCESS, DANGER, WARNING, INFO, LIGHT, DARK;

    fun getClassName(): String = when (this) {
        PRIMARY -> "primary"
        SECONDARY -> "secondary"
        SUCCESS -> "success"
        DANGER -> "danger"
        WARNING -> "warning"
        INFO -> "info"
        LIGHT -> "light"
        DARK -> "dark"
    }
}

@Composable
fun ComponentBase.btnBootstrap(label: String, type: BootstrapButtonType = BootstrapButtonType.PRIMARY, extraClasses: String = "", onBtnClick: () -> Unit) {
    button(label) {
        className = "btn btn-${type.getClassName()} $extraClasses"
        onClick {
            onBtnClick()
        }
    }
}