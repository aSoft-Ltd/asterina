package asterina

sealed class Size {
    data object XXXSmall : Size()
    data object XXSmall : Size()
    data object XSmall : Size()
    data object Small : Size()
    data object Medium : Size()
    data object Large : Size()
    data object XLarge : Size()
    data object XXLarge : Size()
    data object XXXLarge : Size()
}