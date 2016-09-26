package basics.return_and_jumps

fun foo() {
    val ints1 = intArrayOf(1, 2, 3)
    val ints2 = intArrayOf(4, 5, 6)
    ints1.forEach {
        ints2.forEach {
            return@forEach
        }
        println("inner")
    }
    println("outer")
}


fun main(args: Array<String>) {
    foo()
}
