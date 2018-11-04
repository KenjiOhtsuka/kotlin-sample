package functions_and_lambdas.inline_functions

fun a(v: (Int, Int) -> Int): Int {
    return v(2, 4)
}

inline fun b(v: (Int, Int) -> Int): Int {
    return v(2, 4)
}

inline fun c(noinline v: (Int, Int) -> Int): Int {
    return v(2, 4)
}

fun main() {
    val aTime = kotlin.system.measureTimeMillis {
        repeat(2000000000) {
            a() { m, n ->
                m + n + Math.pow(
                    m.toDouble(),
                    2.0
                ).toInt() + Math.pow(n.toDouble(), 2.0).toInt() + 1
            }
        }
    }

    val bTime = kotlin.system.measureTimeMillis {
        repeat(2000000000) {
            b() { m, n ->
                m + n + Math.pow(
                    m.toDouble(),
                    2.0
                ).toInt() + Math.pow(n.toDouble(), 2.0).toInt() + 1
            }
        }
    }

    val cTime = kotlin.system.measureTimeMillis {
        repeat(2000000000) {
            c() { m, n ->
                m + n + Math.pow(
                    m.toDouble(),
                    2.0
                ).toInt() + Math.pow(n.toDouble(), 2.0).toInt() + 1
            }
        }
    }
    println("a: $aTime; b: $bTime; c: $cTime")
}