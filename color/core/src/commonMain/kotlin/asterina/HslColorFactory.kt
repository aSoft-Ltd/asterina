package asterina

import asterina.internal.HslColorImpl

fun hsl(hue: Int, saturation: Int, lightness: Int) = hsla(hue, saturation, lightness, 100)

fun hsla(hue: Int, saturation: Int, lightness: Int, alphaPct: Int): HslColor {
    val h = clamp(hue).between(0..<360)
    val s = clamp(saturation).between(0..100)
    val l = clamp(lightness).between(0..100)
    val a = clamp(alphaPct).between(0..100)
    return HslColorImpl(
        hue = h,
        saturation = s,
        lightness = l,
        alpha = alphaPct(a)
    )
}