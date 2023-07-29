package asterina

import androidx.compose.runtime.compositionLocalOf

val ModeProvider = compositionLocalOf<Mode> { Mode.Light }