package asterina

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

@Composable
fun Splash(
    logo: Char,
    label: String,
    timeout: Duration = 3.seconds,
    onCompleted: () -> Unit
) = Surface(
    modifier = Modifier.fillMaxSize(),
    color = if (ModeProvider.current is Mode.Light) {
        PrimaryPaletteProvider.current.c100
    } else {
        PrimaryPaletteProvider.current.c900
    },
) {
    LaunchedEffect(Unit) {
        delay(timeout)
        onCompleted()
    }
    Box(modifier = Modifier.align(Alignment.Center).padding(bottom = 80.dp)) {
        Box(modifier = Modifier.align(Alignment.Center)) {
            Logo(logo)
        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            Heading1(
                text = label,
                size = Size.XXXLarge,
                align = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(65.dp))
        }
    }
}