package training

import org.junit.Test

class KotlinTests {

    @Test
    fun `prints hello world`() {
        var greeting = "Hello World"
        println(greeting)
        greeting = "Good bye World"
        println(greeting)
    }
}