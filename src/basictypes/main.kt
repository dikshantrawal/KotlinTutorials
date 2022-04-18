package basictypes

fun main() {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(d)
    //    printDouble(i) // Error: Type mismatch
    //    printDouble(f) // Error: Type mismatch


    // More Readable constant literals
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E // hexadecimal literal
    val bytes = 0b11010010_01101001_10010100_10010010 // binary literal


    // Explicit literal
    val b: Byte = 1 // OK, literals are checked statically
    // val i: Int = b // ERROR
    val i1: Int = b.toInt()

    // Booleans
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)

    // String Literal
    val s = "Hello, world!\n"

    // multiline string literal
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """

    println("i = $i") // string template

    // arrays
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    // Primitive type arrays

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr1 = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr3 = IntArray(5) { it * 1 }

}

fun printDouble(d: Double) { print(d) }