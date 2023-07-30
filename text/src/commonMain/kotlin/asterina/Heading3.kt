package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX
import asterina.internal.defaultHeadingAColor


internal val Heading3TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(7.sp, 14.sp, 28.sp)

val Heading3TextSizeProvider = compositionLocalOf { Heading3TextSizeCompute }

@Composable
fun Heading3(
    text: String,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading3TextSizeProvider.current, modifier = modifier)
