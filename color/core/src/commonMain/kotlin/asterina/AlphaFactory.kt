package asterina

import asterina.internal.AlphaDouble
import asterina.internal.AlphaFloat
import asterina.internal.AlphaInt
import asterina.internal.AlphaOpaque
import asterina.internal.AlphaPct
import asterina.internal.AlphaTransparent

fun alpha(value: Int): Alpha {
    val v = clamp(value).between(0..255)
    if(v==0) return AlphaTransparent
    if(v==255) return AlphaOpaque
    return AlphaInt(v)
}

fun alpha(value: Float): Alpha {
    val v = clamp(value).between(0f..1f)
    if(v==0f) return AlphaTransparent
    if(v==1f) return AlphaOpaque
    return AlphaFloat(v)
}

fun alpha(value: Double): Alpha {
    val v = clamp(value).between(0.0..0.1)
    if(v==0.0) return AlphaTransparent
    if(v==1.0) return AlphaOpaque
    return AlphaDouble(v)
}

fun alphaPct(value: Int) : Alpha {
    val v = clamp(value).between(0..100)
    if(v==0) return AlphaTransparent
    if(v==100) return AlphaOpaque
    return AlphaPct(v)
}