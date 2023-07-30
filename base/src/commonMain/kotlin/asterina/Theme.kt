package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.TextUnit

@Composable
fun Theme(
    primary: Palette10 = palette10Mid(240),
    mode: Mode = Mode.Light,
    heading1: SizeEvaluator<TextUnit> = Heading1TextSizeCompute,
    heading2: SizeEvaluator<TextUnit> = Heading2TextSizeCompute,
    heading3: SizeEvaluator<TextUnit> = Heading3TextSizeCompute,
    content: @Composable () -> Unit
) = CompositionLocalProvider(
    PrimaryPaletteProvider provides primary,
    ModeProvider provides mode,
    Heading1TextSizeProvider provides heading1,
    Heading2TextSizeProvider provides heading2
) { content() }