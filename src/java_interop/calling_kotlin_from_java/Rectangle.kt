package java_interop.calling_kotlin_from_java

class Sample @JvmOverloads constructor(val a: Int, val b: Int = a) {
    @JvmOverloads fun f(i: Int, j: Int = 1, k: Int = 2): Int {
        return i * j * k
    }

    @JvmOverloads fun g(i: Int, j: Int = 1, k: Int): Int {
        return i * j * k
    }

    @JvmOverloads fun h(i: Int, j: Double = 1.0, k: Int = 2): Double {
        return i * j * k
    }
}