package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX
import asterina.internal.defaultHeadingAColor

internal val Heading2TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(8.sp, 16.sp, 32.sp)

val Heading2TextSizeProvider = compositionLocalOf { Heading2TextSizeCompute }

@Composable
fun Heading2(
    text: String,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading2TextSizeProvider.current, modifier = modifier)