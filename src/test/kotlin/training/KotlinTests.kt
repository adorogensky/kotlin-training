package training

import org.junit.Test

class KotlinTests {

    fun getGreeting(): String {
        return "Hello World"
    }

    @Test
    fun `prints hello world`() {
        println(getGreeting())
    }
}