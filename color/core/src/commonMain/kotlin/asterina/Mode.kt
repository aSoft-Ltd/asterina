@file:JsExport
package asterina

import kotlin.js.JsExport

sealed class Mode {
    data object Light : Mode()
    data object Dark : Mode()
}