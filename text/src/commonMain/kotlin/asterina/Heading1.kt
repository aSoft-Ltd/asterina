package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX
import asterina.internal.defaultHeadingAColor


internal val Heading1TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(11.sp, 22.sp, 44.sp)

val Heading1TextSizeProvider = compositionLocalOf { Heading1TextSizeCompute }

@Composable
fun Heading1(
    text: String,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading1TextSizeProvider.current, modifier = modifier)