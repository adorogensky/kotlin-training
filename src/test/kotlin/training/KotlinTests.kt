package training

import org.junit.Test
import kotlin.test.assertEquals

class KotlinTests {

    fun getGreeting(greeting: String, who: String): String = "$greeting $who"

    @Test
    fun `prints hello world`() {
        println(getGreeting("Hello", "World"))
    }

    @Test
    fun `creates array and prints its elements`() {
        var numbers = arrayOf(1, 2, 3)
        for (i in numbers) println(i)

        assertEquals(1, numbers[0])
        assertEquals(1, numbers.get(0))
        assertEquals(3, numbers.size)

        numbers.set(0, 2)

        assertEquals(2, numbers[0])
    }

    @Test
    fun `creates list and prints its elements`() {
        var numbers = listOf(1, 2, 3);
    }
}