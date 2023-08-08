package asterina

import androidx.compose.runtime.compositionLocalOf

val PrimaryPaletteProvider = compositionLocalOf { palette10Mid(240) }

val ColorProvider = compositionLocalOf<ColorPair<Color>> {
    ColorPair(
        background = hsl(0, 0, 0),
        foreground = hsl(100, 100, 100)
    )
}