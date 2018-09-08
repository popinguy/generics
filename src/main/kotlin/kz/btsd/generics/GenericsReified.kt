package kz.btsd.generics

fun main(args: Array<String>) {
    val col = listOf("1", "2")
//    col is Set<Int> // compile time error
    col is Set<*> // Java Set<?>
    printSum(listOf(1, 2))
//    printSum(setOf(1, 2))
//    printSum(listOf("1", "2"))

    println(isType<String>("1"))
    println(isType<String>(1))

    println(createObject<Info>())
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalArgumentException()
    println(intList.sum())
}

//fun <T> isType(value: Any): Boolean = value is T // compile time error

inline fun <reified T> isType(value: Any): Boolean = value is T

inline fun <reified T> createObject(): T = T::class.java.newInstance()

data class Info(val greeting: String = "Hello world!")

inline fun <reified T> check() {
    println(isType<T>(""))
}
