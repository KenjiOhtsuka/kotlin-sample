package classes_and_objects.enum_classes

import kotlin.math.max
import kotlin.math.min

enum class EnumClass {
    One, Two, Three
}

enum class PaperSize(val shortEdge: Int, val longEdge: Int) {
    B5(176, 250),
    A4(297, 210),
    Custom(0, 0);

    fun calcSpace(): Int {
        return shortEdge * longEdge
    }
}

enum class SampleEnum(val description: String) {
    A("value A") {
        override fun method1() { /* Code */ }
    },
    B("value B") {
        override fun method1() { /* Code */ }
        override fun method2() { /* Code */ }
    };

    abstract fun method1()

    open fun method2() {
        println("method 2")
    }
}


fun main() {
    EnumClass.One
    PaperSize.Custom

    val a = EnumClass.values()
    println(EnumClass.valueOf("Two"))
    println(EnumClass.Three.name)
    println(EnumClass.Three.ordinal)
}