package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX

internal val Heading3TextSizeEvaluator: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(7.sp, 14.sp, 28.sp)

val Heading3TextSizeEvaluatorLocal = compositionLocalOf { Heading3TextSizeEvaluator }

@Composable
fun Heading3(
    text: String,
    color: Color = ColorLocal.current.foreground,
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading3TextSizeEvaluatorLocal.current, modifier = modifier)