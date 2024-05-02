/*
 * Copyright (c) 2024 Robert Jaros
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import components.card
import components.counter
import components.project
import dev.kilua.*
import dev.kilua.compose.root
import dev.kilua.html.*

//@JsModule("./app.css")
//@JsNonModule
//internal external object CssImports : JsAny

class App : Application() {

    init {
//        useModule(CssImports)
//        CssRegister.register("./app.css")
    }

    override fun start() {

        root("root") {
            var exclaim by remember { mutableStateOf("") }

            div {
                card()
                br {  }
                project()
                // loginForm()
//                p { +"Hello World$exclaim" }
//                button("Click!", className = "flex-none flex items-center justify-center w-9 h-9 rounded-md text-slate-300 border border-slate-200") {
//                    onClick {
//                        exclaim += "!"
//                    }
//                }
//                div {
//                    counter()
//                }
            }
        }
    }
}

fun main() {
    startApplication(::App, TailwindcssModule)
}
