package asterina

class Palette09(
    private val c100: Color,
    private val c200: Color,
    private val c300: Color,
    private val c400: Color,
    private val c500: Color,
    private val c600: Color,
    private val c700: Color,
    private val c800: Color,
    private val c900: Color,
) : Palette {
    override operator fun get(value: Int): Color = when {
        value <= 150 -> c100
        value in 150..<250 -> c200
        value in 250..<350 -> c300
        value in 350..<450 -> c400
        value in 450..<550 -> c500
        value in 550..<650 -> c600
        value in 650..<750 -> c700
        value in 750..<850 -> c800
        else /* value >= 850 */ -> c900
    }
}