package asterina

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.matchParentSize().debug()
    ) {
        Heading1(
            text = text,
            size = Size.XXLarge,
            align = TextAlign.Center,
            modifier = Modifier.weight(0.1f).debug()
        )
        Box(modifier = Modifier.weight(0.8f).debug()) {
            Heading3("test2")
        }
        Box(modifier = Modifier.weight(0.1f).debug().clickable { onGetStartedClicked() }) {
            Heading3("Get Started")
        }
    }
}