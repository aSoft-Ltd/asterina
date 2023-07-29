package asterina.internal

import asterina.Alpha
import asterina.HslColor

internal data class HslColorImpl(
    override val alpha: Alpha,
    override val hue: Int,
    override val saturation: Int,
    override val lightness: Int
) : HslColor {
    override val asHsl = this
}