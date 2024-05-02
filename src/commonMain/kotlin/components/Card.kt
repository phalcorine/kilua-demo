package components

import androidx.compose.runtime.Composable
import dev.kilua.core.ComponentBase
import dev.kilua.form.InputType
import dev.kilua.form.text.text
import dev.kilua.html.*

@Composable
fun ComponentBase.card() {
    div("flex font-sans") {
        div("flex-auto p-6") {
            div("flex flex-wrap") {
                h1("flex-auto text-lg font-semibold text-slate-900") {
                    +"Utility Flex"
                }
                div("text-lg font-semibold text-slate-500") {
                    +"$110.00"
                }
                div("w-full flex-none text-sm font-medium text-slate-700 mt-2") {
                    +"In stock"
                }
            }
            div("flex items-baseline mt-4 mb-6 pb-6 border-b border-slate-200") {
                div("space-x-2 flex text-sm") {
                    label {
                        text(className = "sr-only peer", value = "xs", type = InputType.Radio) {
                            setAttribute("checked", "checked")
                        }
                        div(className = "w-9 h-9 rounded-lg flex items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white") {
                            +"XS"
                        }
                    }
                    label {
                        text(className = "sr-only peer", value = "s", type = InputType.Radio) {}
                        div(className = "w-9 h-9 rounded-lg flex items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white") {
                            +"S"
                        }
                    }
                    label {
                        text(className = "sr-only peer", value = "m", type = InputType.Radio) {}
                        div(className = "w-9 h-9 rounded-lg flex items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white") {
                            +"M"
                        }
                    }
                    label {
                        text(className = "sr-only peer", value = "l", type = InputType.Radio) {}
                        div(className = "w-9 h-9 rounded-lg flex items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white") {
                            +"L"
                        }
                    }
                    label {
                        text(className = "sr-only peer", value = "xl", type = InputType.Radio) {}
                        div(className = "w-9 h-9 rounded-lg flex items-center justify-center text-slate-700 peer-checked:font-semibold peer-checked:bg-slate-900 peer-checked:text-white") {
                            +"XL"
                        }
                    }
                }
            }
            div("flex space-x-4 mb-6 text-sm font-medium") {
                div("flex-auto flex space-x-4") {
                    button(className = "h-10 px-6 font-semibold rounded-md bg-black text-white") {
                        +"Buy Now"
                    }
                    button(className = "h-10 px-6 font-semibold rounded-md border border-slate-200 text-slate-900") {
                        +"Add to bag"
                    }
                }
                button(className = "flex-none flex items-center justify-center w-9 h-9 rounded-md text-slate-300 border border-slate-200") {
                    setAttribute("aria-label", "Like")
                    svg(20, 20) {
                        setAttribute("fill", "currentColor")
                        setAttribute("aria-hidden", "true")
                        path("evenodd", "evenodd", "M3.172 5.172a4 4 0 015.656 0L10 6.343l1.172-1.171a4 4 0 115.656 5.656L10 17.657l-6.828-6.829a4 4 0 010-5.656z")
                    }
                }
            }
            p("text-sm text-slate-700") {
                +"Free shipping on all continental Nigerian orders!"
            }
        }
    }
}