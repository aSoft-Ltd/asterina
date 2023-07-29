package asterina

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.sp

internal val Heading1TextSizeCompute = { size: Size ->
    when (size) {
        Size.XXXSmall -> 0.sp
        Size.XXSmall -> 8.sp
        Size.XSmall -> 12.sp
        Size.Small -> 20.sp
        Size.Medium -> 40.sp
        Size.Large -> 80.sp
        Size.XLarge -> 100.sp
        Size.XXLarge -> 300.sp
        Size.XXXLarge -> 400.sp
    }
}

val Heading1TextSizeProvider = compositionLocalOf { Heading1TextSizeCompute }

internal val Heading2TextSizeCompute = { size: Size ->
    when (size) {
        Size.XXXSmall -> 10.sp
        Size.XXSmall -> 10.sp
        Size.XSmall -> 14.sp
        Size.Small -> 18.sp
        Size.Medium -> 30.sp
        Size.Large -> 60.sp
        Size.XLarge -> 80.sp
        Size.XXLarge -> 120.sp
        Size.XXXLarge -> 120.sp
    }
}

val Heading2TextSizeProvider = compositionLocalOf { Heading2TextSizeCompute }