package asterina.internal

import asterina.toInt255

internal class AlphaDouble(override val asDouble: Double) : AbstractAlpha() {
    override val asFloat by lazy { asDouble.toFloat() }
    override val asInt by lazy { asDouble.toInt255() }
    override val asPct by lazy { (asDouble * 100).toInt() }
}