package functions_and_lambdas.inline_functions.crossinline



inline fun f(crossinline body: () -> Unit) {
    val h = object: Runnable {
        override fun run() = body()
    }
    h.run()
}

inline fun g(noinline body: () -> Unit) {
    val h = object: Runnable {
        override fun run() = body()
    }
    h.run()
}


fun main(args: Array<String>) {
    val body = {
        println("body")
    }
    println("f ----")
    f(body)
    println("g ----")
    g(body)
}