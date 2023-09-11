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
    color: ColorPair = defaultSurfaceColorPair(ModeLocal.current, PrimaryPaletteLocal.current),
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = CompositionLocalProvider(ColorLocal provides color) {
    Box(modifier.background(color.background.toComposeColor()), content = content)
}

internal fun defaultSurfaceColorPair(mode: Mode, palette: Palette) = when (mode) {
    Mode.Light -> ColorPair(
        background = palette[200],
        foreground = palette[800]
    )

    Mode.Dark -> ColorPair(
        background = palette[800],
        foreground = palette[200]
    )
}

fun Modifier.debug() = border(2.dp, androidx.compose.ui.graphics.Color.Red)