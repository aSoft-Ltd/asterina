package asterina

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.lerp

internal class MinMaxSizeEvaluator(
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