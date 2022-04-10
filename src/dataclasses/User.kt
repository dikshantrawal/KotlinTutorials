package dataclasses

data class User(val name: String = "", val age: Int = 0)

data class Person(val name: String) {
    var age: Int = 0
}

fun main() {
    val himalaya = User(name = "Himalaya", age = 24)
    println(himalaya)

    val person1 = Person("John")
    val person2 = Person("John")

    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")
    println("person1 with age ${person1.age}: $person1")
    println("person2 with age ${person2.age}: $person2")

    val olderHimalaya = himalaya.copy(age = 26)

    println(olderHimalaya)
}