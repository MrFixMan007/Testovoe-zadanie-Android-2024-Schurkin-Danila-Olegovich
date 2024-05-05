class FindDuplicateUseCase {

    // если повторяющихся не найдёт, то вернёт 0
    fun execute(paramValue: Int) : Int{
        val array = (Array(100) {i -> i + 1} + paramValue)

        return array
            .groupBy { it }
            .entries
            .firstOrNull { it.value.size > 1 }
            ?.key?:0
    }
}