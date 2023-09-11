package asterina

fun palette09Mid(hue: Int): Palette = Palette09(
    hsl(hue, 25, 98),
    hsl(hue, 46, 91),
    hsl(hue, 42, 79),
    hsl(hue, 47, 69),
    hsl(hue, 47, 58),
    hsl(hue, 47, 44),
    hsl(hue, 47, 31),
    hsl(hue, 46, 19),
    hsl(hue, 32, 8),
)

fun palette09High(hue: Int): Palette = Palette09(
    hsl(hue, 100, 99),
    hsl(hue, 100, 98),
    hsl(hue, 100, 95),
    hsl(hue, 92, 83),
    hsl(hue, 100, 70),
    hsl(hue, 100, 50),
    hsl(hue, 100, 30),
    hsl(hue, 100, 10),
    hsl(hue, 100, 5)
)