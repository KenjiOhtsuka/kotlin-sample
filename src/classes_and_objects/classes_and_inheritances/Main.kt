package classes_and_objects.classes_and_inheritances

open class Base1

// Base class must be initialized after `:`
class Derived1 : Base1()

abstract class AbstractClass {
    val int1: Int = 1
    abstract val int2: Int

    // can not be overridden
    fun notAbstractMethod() {
        println("test")
    }

    abstract fun abstractMethod()
}

class Derived2: AbstractClass() {
    override val int2 = 2

    override fun abstractMethod() {
        println("abstract")
    }
}