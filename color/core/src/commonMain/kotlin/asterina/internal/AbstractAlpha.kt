package asterina.internal

import asterina.Alpha

internal abstract class AbstractAlpha : Alpha {
    override fun equals(other: Any?): Boolean = other is Alpha && other.asInt == asInt
    override fun hashCode() = asInt

    override fun isTransparent() = asInt == 0
}