package other.destructuring_declarations

data class Result(val a: Int, val b: Int)

fun function(): Result {
    return Result(1, 2)
}

fun main(args: Array<String>) {
    val map = mapOf(
            "a" to 1,
            "b" to 2
    )
    for ((key, value) in map) {
        println("$key : $value")
    }

    val (a, b) = function()
    println("a : $a")
    println("b : $b")

    val mm = mutableMapOf<String, Int>(
            "first" to 1,
            "second" to 2,
            "third" to 3
    )
    mm.put("forth", 4)

    val im = mapOf<String, Int>(
            "first" to 1,
            "second" to 2,
            "third" to 3
    )
    // compile error
    //im.put("forth", 4)

}