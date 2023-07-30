package asterina

interface SizeEvaluator<out S> {
    fun evaluate(size: Size): S
}