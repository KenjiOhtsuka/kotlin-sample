package classes_and_objects.data_classes

data class DataClass(val name: String) {
    var v: Int = 1
}

// Data class cant be open, abstract

interface I {

}

abstract class A {

}

data class Derived(val name: String) : A(), I {

}

fun main() {
    val data1 = DataClass("one")
    val data2 = DataClass("one")
    println(data1 == data2)
    data2.v = 2
    println(data1 == data2)
    println(data1.hashCode() == data2.hashCode())

    data1.copy("1")
    println(data1.component1())
}