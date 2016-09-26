package other.reflection

fun isOdd(x: Int) = x % 2 != 0

fun isEven(x: Int) = x % 2 == 0
fun isEven(s: String) = s == "sample" || s == "example"


fun <A, B, C> compose(
        f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }}
fun length(s: String) = s.length


fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

    println(numbers.filter(::isEven))

    val a = ::isOdd
    println(a(1))

    val b: (Int) -> Boolean = ::isEven
    println(b(1))

    /* function composition */
    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}