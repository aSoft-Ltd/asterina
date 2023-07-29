package asterina

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import asterina.transformers.toComposeColor

@Composable
fun ThemeColorSelector(palette: Palette10) = Column(modifier = Modifier.width(250.dp)) {
    Swatch(color = palette.c100)
    Swatch(color = palette.c200)
    Swatch(color = palette.c300)
    Swatch(color = palette.c400)
    Swatch(color = palette.c500)
    Swatch(color = palette.c600)
    Swatch(color = palette.c700)
    Swatch(color = palette.c800)
    Swatch(color = palette.c900)
}


@Composable
internal fun Swatch(color: Color) = Box(modifier = Modifier.background(color.toComposeColor()).height(50.dp).fillMaxWidth())