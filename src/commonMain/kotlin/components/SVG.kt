package components

import androidx.compose.runtime.Composable
import dev.kilua.html.Div
import dev.kilua.html.Tag
import dev.kilua.html.tag
import web.dom.HTMLElement

@Composable
fun Div.svg(width: Int, height: Int, block: @Composable Tag<HTMLElement>.() -> Unit = {}) {
    tag("svg") {
        setAttribute("width", "$width")
        setAttribute("height", "$height")
        block()
    }
}

@Composable
fun Tag<HTMLElement>.path(fillRule: String = "", clipRule: String = "", d: String) {
    tag("path") {
        setAttribute("fill-rule", fillRule)
        setAttribute("clip-rule", clipRule)
        setAttribute("d", d)
    }
}

@Composable
fun Tag<HTMLElement>.kLink(href: String, className: String, block: @Composable Tag<HTMLElement>.() -> Unit = {}) {
    tag("a") {
        setAttribute("href", href)
        setAttribute("class", className)
        block()
    }
}