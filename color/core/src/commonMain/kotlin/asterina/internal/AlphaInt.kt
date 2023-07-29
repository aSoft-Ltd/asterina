package asterina.internal

import asterina.toDouble255
import asterina.toFloat255

internal class AlphaInt(override val asInt: Int) : AbstractAlpha() {
    override val asFloat by lazy { asInt.toFloat255() }
    override val asDouble by lazy { asInt.toDouble255() }
    override val asPct by lazy { (asInt * 100) / 255 }
}