@file:JsExport
package asterina

import kotlin.js.JsExport

@Suppress("NON_EXPORTABLE_TYPE")
interface Color {
    val alpha: Alpha

    val asHsl get() = this as? HslColor
}