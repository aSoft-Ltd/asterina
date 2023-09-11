package asterina

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit

@Composable
fun Theme(
    primary: Palette = palette09High(240),
    mode: Mode = Mode.Light,
    heading1: SizeEvaluator<TextUnit> = Heading1TextSizeEvaluator,
    heading2: SizeEvaluator<TextUnit> = Heading2TextSizeEvaluator,
    heading3: SizeEvaluator<TextUnit> = Heading3TextSizeEvaluator,
    content: @Composable BoxScope.() -> Unit
) = CompositionLocalProvider(
    PrimaryPaletteLocal provides primary,
    ModeLocal provides mode,
    Heading1TextSizeEvaluatorLocal provides heading1,
    Heading2TextSizeEvaluatorLocal provides heading2,
    Heading3TextSizeEvaluatorLocal provides heading3,
) {
    Surface(modifier = Modifier.fillMaxSize(), content = content)
}