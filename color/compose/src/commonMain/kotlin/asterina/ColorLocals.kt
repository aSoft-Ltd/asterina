package asterina

import androidx.compose.runtime.compositionLocalOf

val PrimaryPaletteLocal = compositionLocalOf { palette09Mid(240) }

val ColorLocal = compositionLocalOf {
    ColorPair(
        background = hsl(0, 0, 0),
        foreground = hsl(100, 100, 100)
    )
}