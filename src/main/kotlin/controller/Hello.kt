package code.com.controller

class Hello {

    private val name: String = "Ahmed"
    private val age = 42



    fun hello(): List<Int> {
        println("Hello, $name!")
        println("Age: $age")
        return listOf(1, 2, 3)
    }
}