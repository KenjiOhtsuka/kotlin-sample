package functions_and_lambdas.functions.infix

infix fun Matrix.`*`(x: Matrix): Matrix {
    return Matrix(
            this.a * x.a + this.b * x.c,
            this.a * x.b + this.b * x.d,
            this.c * x.a + this.d * x.b,
            this.c * x.b + this.d * x.d
    )
}

fun main(args: Array<String>) {
    val m = Matrix(1.0, 2.0, 3.0, 4.0) `*` Matrix(5.0, 6.0, 7.0, 8.0)
    println(m.a)
    println(m.b)
    println(m.c)
    println(m.d)
}