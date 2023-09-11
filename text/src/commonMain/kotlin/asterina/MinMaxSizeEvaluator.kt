package asterina

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.lerp

internal class MinMaxSizeEvaluator(
    private val min: TextUnit,
    private val mid: TextUnit,
    private val max: TextUnit
) : SizeEvaluator<TextUnit> {
    override fun evaluate(size: Size) = when (size) {
        Size.XXXSmall -> lerp(min, mid, 0f)
        Size.XXSmall -> lerp(min, mid, 0.25f)
        Size.XSmall -> lerp(min, mid, 0.5f)
        Size.Small -> lerp(min, mid, 0.75f)
        Size.Medium -> lerp(min, mid, 1f) // or lerp(mid,max,0f)
        Size.Large -> lerp(mid, max, 0.25f)
        Size.XLarge -> lerp(mid, max, 0.5f)
        Size.XXLarge -> lerp(mid, max, 0.75f)
        Size.XXXLarge -> lerp(mid, max, 1f)
    }
}