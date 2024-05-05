import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindDuplicateUseCaseTest {

    private val z1 = FindDuplicateUseCase()

    @Test
    fun `должен вернуть 100 в случае вставки 100`() {
        assertEquals(100, z1.execute(100))
    }

    @Test
    fun `должен вернуть 0 в случае вставки 101`() {
        assertEquals(0, z1.execute(101))
    }

    @Test
    fun `должен вернуть 50 в случае вставки 50`() {
        assertEquals(50, z1.execute(50))
    }

    @Test
    fun `должен вернуть 1 в случае вставки 1`() {
        assertEquals(1, z1.execute(1))
    }
}