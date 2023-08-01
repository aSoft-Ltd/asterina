package asterina

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit

@Composable
fun Theme(
    primary: Palette10 = palette10High(240),
    mode: Mode = Mode.Light,
    heading1: SizeEvaluator<TextUnit> = Heading1TextSizeCompute,
    heading2: SizeEvaluator<TextUnit> = Heading2TextSizeCompute,
    heading3: SizeEvaluator<TextUnit> = Heading3TextSizeCompute,
    content: @Composable BoxScope.() -> Unit
) = CompositionLocalProvider(
    PrimaryPaletteProvider provides primary,
    ModeProvider provides mode,
    Heading1TextSizeProvider provides heading1,
    Heading2TextSizeProvider provides heading2,
    Heading3TextSizeProvider provides heading3,
) {
    Surface(modifier = Modifier.fillMaxSize(), content = content)
}