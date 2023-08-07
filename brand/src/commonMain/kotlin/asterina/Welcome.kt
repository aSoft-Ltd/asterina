package asterina

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextAlign
import asterina.transformers.toComposeColor
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.regular.Compass

@Composable
fun Welcome(
    text: String = "Welcome",
    onGetStartedClicked: () -> Unit
) = Surface(
    modifier = Modifier.fillMaxSize(),
    color = if (ModeProvider.current is Mode.Light) {
        PrimaryPaletteProvider.current.c100
    } else {
        PrimaryPaletteProvider.current.c900
    },
) {
    val color = if (ModeProvider.current is Mode.Light) {
        PrimaryPaletteProvider.current.c900
    } else {
        PrimaryPaletteProvider.current.c100
    }
    val ccolor = color.toComposeColor()
    val radius = 40f
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(ccolor, radius = size.minDimension / 7, center = Offset(-0.04f * size.width, 0.2f * size.height))
        drawRoundRect(ccolor, topLeft = Offset(0.0f, 0.9f * size.height), cornerRadius = CornerRadius(radius, radius), size = size.copy(height = 0.4f * size.height))
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.matchParentSize()
    ) {
        Spacer(Modifier.weight(0.2f))
        Heading1(
            text = text,
            size = Size.XXLarge,
            align = TextAlign.Center,
            modifier = Modifier.weight(0.25f)
        )
        Box(modifier = Modifier.weight(0.5f)) {
            val vector = rememberVectorPainter(
                image = FontAwesomeIcons.Regular.Compass,
            )
            Icon(vector, color = color, "Test Icon")
        }
        Spacer(Modifier.weight(0.2f))
        Box(modifier = Modifier.weight(0.1f).clickable { onGetStartedClicked() }) {
            Heading1(
                text = "Get Started",
                color = if (ModeProvider.current is Mode.Light) {
                    PrimaryPaletteProvider.current.c100
                } else {
                    PrimaryPaletteProvider.current.c900
                }
            )
        }
    }
}