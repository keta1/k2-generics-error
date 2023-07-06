import kotlin.properties.ReadOnlyProperty

fun main() {
    val a: Int? = 1
    val b by test { a }
    printInt(b)
}
 fun <T> test(value: () -> T): ReadOnlyProperty<Nothing?, T & Any> =
    ReadOnlyProperty { _, _ -> value()!! }
fun printInt(i: Int) {
    println(i)
}
