fun main() {
    val z2 = PrintElementsAndCountsUseCase()
    println(z2.execute(Array(100) {i -> i + 1} + 1 + 2 + 1 + 3 + 2))
}