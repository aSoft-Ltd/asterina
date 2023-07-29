package asterina.internal

import asterina.toDouble255

internal class AlphaPct(override val asPct: Int) : AbstractAlpha() {
    override val asFloat by lazy { asPct.toFloat() / 100 }
    override val asDouble by lazy { asPct.toDouble255() / 100 }
    override val asInt by lazy { (asPct * 255) / 100 }
}