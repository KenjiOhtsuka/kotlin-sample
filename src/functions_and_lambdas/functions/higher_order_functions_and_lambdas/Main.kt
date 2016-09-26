package functions_and_lambdas.functions.higher_order_functions_and_lambdas

fun main(args: Array<String>) {
    val l = listOf<Int>(1, 2, 3)
    println(l.filter({ it -> it % 2 == 0}))
    println(l.filter { it -> it % 2 == 0})

    listOf<Int>(1, 2, 3).forEach(fun (it) {
        if (it % 2 == 0) return
        println(it)
    })

    listOf<Int>(1, 2, 3).forEach({
        if (it % 2 == 0) return
        println(it)
    })
}