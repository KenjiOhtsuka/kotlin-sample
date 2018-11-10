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

class Food {
    var name = ""
    set(value) {
        field = value.trim()
    }
    var starch = 0.0
    var protain = 0.0
    var fat = 0.0
    val energy: Double
    get() = starch * 4 + protain * 4 + fat * 9
}

fun main() {
    Food().also {
        it.starch = 1.0
        println(it.energy)
        it.protain = 1.0
        it.fat = 1.0
        println(it.energy)
    }

    WithoutPrimaryConstructor()
    WithPrimaryConstructor(1)
    WithAnotherSecondaryConstructor(1)
}

open class WithoutPrimaryConstructor {
    init {
        println("initialize")
    }

    constructor() {
        println("Secondary")
    }
}

open class WithPrimaryConstructor(val name: String) {
    init {
        println("initialize")
    }

    constructor(number: Int) : this(number.toString()) {
        println("Secondary")
    }
}

open class WithAnotherSecondaryConstructor(val name: String) {
    init {
        println("initialize")
    }

    constructor(number: Int): this(number.toDouble()) {
        println("secondary (Int)")
    }

    constructor(number: Double): this(number.toString()) {
        println("secondary (Double)")
    }
}