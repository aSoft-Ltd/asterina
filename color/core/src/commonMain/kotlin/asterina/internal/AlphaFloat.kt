package asterina.internal

import asterina.toInt255

internal class AlphaFloat(override val asFloat: Float) : AbstractAlpha() {
    override val asDouble by lazy { asFloat.toDouble() }
    override val asInt by lazy { asFloat.toInt255() }
    override val asPct by lazy { (asFloat * 100).toInt() }
}