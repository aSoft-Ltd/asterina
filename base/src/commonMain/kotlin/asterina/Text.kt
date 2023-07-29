package asterina

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import asterina.transformers.toComposeColor

@Composable
fun Text(
    text: String,
    size: Size = Size.Medium,
    modifier: Modifier = Modifier
) {
    BasicText(text, modifier)
}

@Composable
fun Heading1(
    text: String,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, sizeComputer = Heading1TextSizeProvider.current, modifier = modifier)

@Composable
fun Heading2(
    text: String,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    size: Size = Size.Medium,
    align: TextAlign? = null,
    modifier: Modifier = Modifier
) = HeadingX(text = text, color = color, size = size, align = align, sizeComputer = Heading2TextSizeProvider.current, modifier = modifier)

@Composable
internal fun HeadingX(
    text: String,
    size: Size,
    align: TextAlign?,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    sizeComputer: (Size) -> TextUnit,
    modifier: Modifier = Modifier
) {
    BasicText(text, modifier, style = TextStyle(color = color.toComposeColor(), fontSize = sizeComputer(size), textAlign = align))
}

private fun defaultHeadingAColor(mode: Mode, palette: Palette10) = when (mode) {
    Mode.Light -> palette.c900
    Mode.Dark -> palette.c100
}

@Composable
fun Logo(
    char: Char,
    size: Size = Size.XXLarge,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
    modifier: Modifier = Modifier
) {
    val style = TextStyle(
        color = color.toComposeColor(),
        textAlign = TextAlign.Center,
        fontSize = Heading2TextSizeProvider.current(size),
        letterSpacing = 0.sp,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.Both
        )
    )
    BasicText(
        text = char.toString(),
        style = style,
        modifier = modifier.border(color = androidx.compose.ui.graphics.Color.Red, width = 2.dp)
            .padding(0.dp)
    )
}