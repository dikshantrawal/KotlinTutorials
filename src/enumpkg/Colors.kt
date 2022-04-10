package enumpkg

interface DoColor {
    fun doColor()
}

enum class Colors(val colorName: String, val colorValue: Int) : DoColor {
    RED("Red", 1){
        override fun doColor() {
            println("Colored with $colorName")
        }
                 },
    BLUE("Blue", 2){
        override fun doColor() {
            println("Colored with $colorName")
        }
    },
    GREEN("Green", 3){
        override fun doColor() {
            println("Colored with $colorName")
        }
    },
}

fun main () {
    Colors.values().forEach {
        print("${it.colorName} : ${it.colorValue} : ")
        it.doColor()
    }
}