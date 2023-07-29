package asterina

fun Clamp<Int>.between(range: IntRange): Int {
    if (value <= range.first) return range.first
    if (value >= range.last) return range.last
    return value
}

fun Clamp<Float>.between(range: ClosedFloatingPointRange<Float>): Float {
    if (value <= range.start) return range.start
    if (value >= range.endInclusive) return range.endInclusive
    return value
}

fun Clamp<Double>.between(range: ClosedFloatingPointRange<Double>): Double {
    if (value <= range.start) return range.start
    if (value >= range.endInclusive) return range.endInclusive
    return value
}