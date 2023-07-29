package asterina.internal

internal object AlphaOpaque : AbstractAlpha() {
    override val asDouble = 1.0
    override val asFloat = 1f
    override val asInt = 255
    override val asPct = 100
}