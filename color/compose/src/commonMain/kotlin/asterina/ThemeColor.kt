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
fun ThemeColorSelector(palette: Palette) = Column(modifier = Modifier.width(250.dp)) {
    for (i in 1..9) Swatch(palette[i * 100])
}


@Composable
internal fun Swatch(color: Color) = Box(modifier = Modifier.background(color.toComposeColor()).height(50.dp).fillMaxWidth())