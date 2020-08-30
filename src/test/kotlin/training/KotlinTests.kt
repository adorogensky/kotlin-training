package training

import org.junit.Test

class KotlinTests {

    @Test
    fun `prints hello world`() {
        var greeting:String? = "Hello World"
        println(greeting)
        greeting = null
        println(greeting)
    }
}