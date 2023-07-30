package asterina.internal

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import asterina.Color
import asterina.Mode
import asterina.Palette10
import asterina.Size
import asterina.SizeEvaluator
import asterina.transformers.toComposeColor

@Composable
internal fun HeadingX(
    text: String,
    size: Size,
    align: TextAlign?,
    color: Color,
    evaluator: SizeEvaluator<TextUnit>,
    modifier: Modifier = Modifier
) {
    BasicText(text, modifier, style = TextStyle(color = color.toComposeColor(), fontSize = evaluator.evaluate(size), textAlign = align))
}

internal fun defaultHeadingAColor(mode: Mode, palette: Palette10) = when (mode) {
    Mode.Light -> palette.c900
    Mode.Dark -> palette.c100
}