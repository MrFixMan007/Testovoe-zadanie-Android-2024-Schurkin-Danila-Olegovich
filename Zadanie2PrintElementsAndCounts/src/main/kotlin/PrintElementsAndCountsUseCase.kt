class PrintElementsAndCountsUseCase {

    fun execute(array: Array<Int>){
        array
            .groupingBy { it }
            .eachCount()
            .forEach { (element, count) -> println("$element| $count") }
    }
}