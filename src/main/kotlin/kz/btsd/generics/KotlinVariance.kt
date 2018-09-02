package kz.btsd.generics

fun printContent(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(elements: MutableList<Any>) {
    elements.add(42)
}

fun main(args: Array<String>) {
    printContent(listOf(1, 2, 3))
    printContent(listOf("1", "2"))

    val strings = mutableListOf("1", "2")
    // addAnswer(strings)
}

open class Animal {
    fun feed() {
        TODO()
    }
}

// TODO var, private
class Herd<out T : Animal>(vararg animals: T) {
    fun get(index: Int): T  {
        TODO()
    }

    fun size(): Int { TODO() }
}

fun feedAll(animals: Herd<Animal>) {
    TODO()
}

class Cat : Animal() {
    fun cleanLitter() {
        TODO()
    }
}

fun takeCareOfCats(herd: Herd<Cat>) {
    for (i in 0 until herd.size()) {
        herd.get(i).cleanLitter()
    }
    // feedAll(herd)
}