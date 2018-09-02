package kz.btsd.generics

val list1 = listOf<String>()
val list2: List<String> = listOf()
val list3 = listOf("John", "Jack")
val list4 = mutableListOf("John", "Jack")
// val list4 = listOf() // compile time error

fun <T> createTask(): T {
    val list = listOf<T>()
    TODO()
}

fun <T> MutableList<T>.addToList(item: T) {
    add(item)
}

val <T> List<T>.penultimate
    get() = this[size - 2]

class Worker<Task, Result> {
    fun work(t: Task) {
    }

    fun getResult(): Result {
        return " " as Result
    }
}

// type parameter constraints
fun <T : Number> List<T>.sumNumbers(): T {
    TODO()
}

fun <T : Comparable<T>> max(first: T, second: T) {
    TODO()
}

fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

// null value
class HardWorker<T> {
    fun workHard(task: T) {
        task.toString()
    }
}

fun main(args: Array<String>) {
    list4.addToList("Jam")
    println(list3.penultimate)
}