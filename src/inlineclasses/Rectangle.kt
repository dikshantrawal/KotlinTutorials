package inlineclasses

@JvmInline
value class Width(val width: Int)

@JvmInline
value class Height(val height: Int)

class Rectangle(val width: Width, val height: Height) {
    fun showSpec() {
        println("$width, $height")
    }

    fun area(): Int {
        return width.hashCode() * height.hashCode()
    }
}

@JvmInline
value class Name(val s: String) {
    init {
        require(s.length > 0) { }
    }

    val length: Int get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class Name1(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

fun main() {
    val rectangle = Rectangle(Width(50), Height(10))
    rectangle.showSpec()
    println(rectangle.area())
}