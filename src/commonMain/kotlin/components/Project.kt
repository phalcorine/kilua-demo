package components

import androidx.compose.runtime.Composable
import dev.kilua.core.ComponentBase
import dev.kilua.form.InputType
import dev.kilua.form.text.text
import dev.kilua.html.*

@Composable
fun ComponentBase.project() {
    section {
        header("bg-white space-y-4 p-4 sm:px-8 sm:py-6 lg:p-4 xl:px-8 xl:py-6") {
            div("flex items-center justify-between") {
                h2("font-semibold text-slate-900") { +"Projects" }
                kLink("/new", className = "hover:bg-blue-400 group flex items-center rounded-md bg-blue-500 text-white text-sm font-medium pl-2 pr-3 py-2 shadow-sm") {
                    svg(20, 20) {
                        setAttribute("fill", "currentColor")
                        setAttribute("class", "mr-2")
                        setAttribute("aria-hidden", "true")
                        path(d = "M10 5a1 1 0 0 1 1 1v3h3a1 1 0 1 1 0 2h-3v3a1 1 0 1 1-2 0v-3H6a1 1 0 1 1 0-2h3V6a1 1 0 0 1 1-1Z")
                    }
                    +"New"
                }
            }
            div(className = "group relative") {
                svg(20, 20) {
                    setAttribute("fill", "currentColor")
                    setAttribute("class", "absolute left-3 top-1/2 -mt-2.5 text-slate-400 pointer-events-none group-focus-within:text-blue-500")
                    setAttribute("aria-hidden", "true")
                    path(fillRule = "evenodd", clipRule = "evenodd", d = "M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z")
                }
                text {
                    className = "focus:ring-2 focus:ring-blue-500 focus-outline-none appearance-none w-full text-sm leading-6 text-slate-900 placeholder-slate-400 rounded-md py-2 pl-10 ring-1 ring-slate-200 shadow-sm"
                    type = InputType.Text
                    setAttribute("label", "Filter projects")
                    placeholder = "Filter projects..."
                }
            }
        }
    }
}