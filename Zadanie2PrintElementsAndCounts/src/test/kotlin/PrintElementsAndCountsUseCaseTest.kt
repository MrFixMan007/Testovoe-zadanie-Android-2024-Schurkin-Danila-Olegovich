import org.junit.jupiter.api.Test

class PrintElementsAndCountsUseCaseTest {

    private val z2 = PrintElementsAndCountsUseCase()

    @Test
    fun execute() {
        z2.execute(Array(100) {i -> i + 1} + 5 + 10 + 100 + 10)
    }
}