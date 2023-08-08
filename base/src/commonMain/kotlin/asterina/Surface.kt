package asterina

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import asterina.transformers.toComposeColor

@Composable
fun Surface(
    color: ColorPair<Color> = defaultSurfaceColorPair(ModeProvider.current, PrimaryPaletteProvider.current),
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = CompositionLocalProvider(ColorProvider provides color) {
    Box(modifier.background(color.background.toComposeColor()), content = content)
}

internal fun defaultSurfaceColorPair(mode: Mode, palette: Palette10) = when (mode) {
    Mode.Light -> ColorPair(
        background = palette.c200,
        foreground = palette.c800
    )

    Mode.Dark -> ColorPair(
        background = palette.c800,
        foreground = palette.c200
    )
}

fun Modifier.debug() = border(2.dp, androidx.compose.ui.graphics.Color.Red)