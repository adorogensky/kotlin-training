package training

import org.junit.Test

class KotlinTests {

    fun getGreeting(greeting: String, who: String): String = "$greeting $who"

    @Test
    fun `prints hello world`() {
        println(getGreeting("Hello", "World"))
    }
}