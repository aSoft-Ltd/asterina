package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX

internal val Heading1TextSizeEvaluator: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(11.sp, 22.sp, 44.sp)

val Heading1TextSizeEvaluatorLocal = compositionLocalOf { Heading1TextSizeEvaluator }

@Composable
fun Heading1(
    text: String,
    color: Color = ColorLocal.current.foreground,
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading1TextSizeEvaluatorLocal.current, modifier = modifier)