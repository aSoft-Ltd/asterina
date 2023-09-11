package asterina

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import asterina.internal.HeadingX

internal val Heading2TextSizeEvaluator: SizeEvaluator<TextUnit> = MinMaxSizeEvaluator(8.sp, 16.sp, 32.sp)

val Heading2TextSizeEvaluatorLocal = compositionLocalOf { Heading2TextSizeEvaluator }

@Composable
fun Heading2(
    text: String,
    color: Color = ColorLocal.current.foreground,
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, evaluator = Heading2TextSizeEvaluatorLocal.current, modifier = modifier)