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
//    addAnswer(strings)

    val anyComparator = Comparator<Any> {
        i1, i2 -> i1.hashCode() - i2.hashCode()
    }

    strings.sortWith(anyComparator)
}

interface Producer<out T> {
    fun produce(): T
}

// Producer<Cat> is subtype of Producer<Animal>

open class Animal {
    fun feed() {
        TODO()
    }
}

// TODO var, private
class Herd<T : Animal>(vararg animals: T) {
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
//    feedAll(herd)
}

interface Consumer<in T> {
    fun consume(item: T)
}
// Consumer<Animal> is subtype of Consumer<Cat>
// Function1

// type projection
fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}