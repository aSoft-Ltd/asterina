package asterina.transformers

import asterina.Color
import asterina.HslColor
import androidx.compose.ui.graphics.Color.Companion as CColor

private fun HslColor.toComposeColor() = CColor.hsl(hue.toFloat(), saturation.toFloat() / 100, lightness.toFloat() / 100, alpha = alpha.asFloat)

fun Color.toComposeColor() = when(this) {
    is HslColor -> toComposeColor()
}