@file:JsExport

package asterina

import kotlin.js.JsExport

data class ColorPair<out T>(
    val background: T,
    val foreground: T
) {
    fun <R> map(transformer: (T) -> R) = ColorPair(transformer(background), transformer(foreground))
}