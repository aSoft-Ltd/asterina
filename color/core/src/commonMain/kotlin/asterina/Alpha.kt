@file:JsExport
package asterina

import kotlin.js.JsExport

interface Alpha {
    val asDouble: Double
    val asFloat: Float
    val asInt: Int
    val asPct: Int

    fun isTransparent() : Boolean
}