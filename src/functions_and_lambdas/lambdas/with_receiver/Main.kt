package functions_and_lambdas.lambdas.with_receiver

fun main(args: Array<String>) {
    val sum1 = fun Int.(other: Int): Int = this + other
    println(1.sum1(2))

    val sum2: Int.(Int) -> Int = { it + this }
    println(1.sum2(2))
}