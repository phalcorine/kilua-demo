package components

import androidx.compose.runtime.Composable
import dev.kilua.core.ComponentBase
import dev.kilua.form.InputType
import dev.kilua.form.form
import dev.kilua.form.text.text
import dev.kilua.html.*

@Composable
fun ComponentBase.loginForm() {
    main {
        form {
            img {

            }
            h1 { +"Please sign in" }
            div(className = "form-floating") {
                text(type = InputType.Email, className = "form-control") {}
                label { +"Email Address" }
            }
            div(className = "form-floating") {
                text(type = InputType.Password, className = "form-control") {}
                label { +"Password" }
            }
            div(className = "form-check text-start my-3") {
                text(type = InputType.Checkbox) {}
                label { +"Remember me" }
            }
            button(className = "btn btn-primary w-100 py-2") { +"Sign in" }
            p { +"2017-2024" }
        }
    }
}