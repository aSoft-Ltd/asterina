package asterina

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp

interface SizeEvaluator<out S> {
    fun evaluate(size: Size): S
}

internal class MinMaxSizeCompute(
    private val min: TextUnit,
    private val value: TextUnit,
    private val max: TextUnit
) : SizeEvaluator<TextUnit> {
    override fun evaluate(size: Size) = when (size) {
        Size.XXXSmall -> lerp(min, value, 0f)
        Size.XXSmall -> lerp(min, value, 0.25f)
        Size.XSmall -> lerp(min, value, 0.5f)
        Size.Small -> lerp(min, value, 0.75f)
        Size.Medium -> lerp(min, value, 1f) // or lerp(value,max,0f)
        Size.Large -> lerp(value, max, 0.25f)
        Size.XLarge -> lerp(value, max, 0.5f)
        Size.XXLarge -> lerp(value, max, 0.75f)
        Size.XXXLarge -> lerp(value, max, 1f)
    }
}

internal val Heading1TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeCompute(11.sp, 22.sp, 44.sp)
internal val Heading2TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeCompute(8.sp, 16.sp, 32.sp)
internal val Heading3TextSizeCompute: SizeEvaluator<TextUnit> = MinMaxSizeCompute(7.sp, 14.sp, 28.sp)

val Heading1TextSizeProvider = compositionLocalOf { Heading1TextSizeCompute }
val Heading2TextSizeProvider = compositionLocalOf { Heading2TextSizeCompute }
val Heading3TextSizeProvider = compositionLocalOf { Heading3TextSizeCompute }