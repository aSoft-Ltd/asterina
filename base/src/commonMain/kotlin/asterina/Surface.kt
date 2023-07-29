package asterina

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import asterina.transformers.toComposeColor

@Composable
fun Surface(
    color: Color = defaultSurfaceColor(ModeProvider.current, PrimaryPaletteProvider.current),
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) = Box(modifier.background(color.toComposeColor()), content = content)

internal fun defaultSurfaceColor(mode: Mode, palette: Palette10): Color = when (mode) {
    Mode.Light -> palette.c200
    Mode.Dark -> palette.c800
}