package asterina

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import asterina.internal.defaultHeadingAColor
import asterina.transformers.toComposeColor

@Composable
fun Logo(
    char: Char,
    size: Size = Size.XXXLarge,
    color: Color = defaultHeadingAColor(ModeProvider.current, PrimaryPaletteProvider.current),
) = Column {
    val style = TextStyle(
        color = color.toComposeColor(),
        textAlign = TextAlign.Center,
        fontSize = Heading1TextSizeProvider.current.evaluate(size) * 6,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Bottom,
            trim = LineHeightStyle.Trim.Both
        )
    )
    BasicText(text = char.toString(),style = style)
    Spacer(modifier = Modifier.height(50.dp))
}