@file:Suppress("NOTHING_TO_INLINE")

package asterina

inline fun Float.toInt255() = (this * 255).toInt()

inline fun Double.toInt255() = (this * 255).toInt()

inline fun Int.toFloat255() = this.toFloat() / 255

inline fun Int.toDouble255() = this.toDouble() / 255