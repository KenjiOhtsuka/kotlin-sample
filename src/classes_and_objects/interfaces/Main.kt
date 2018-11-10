package classes_and_objects.interfaces

interface SampleInterface {
    val int1: Int

    val int2: Int
        get() {
            return 2
        }

    fun method()

    fun methodWithBody() {
        println("interface method")
    }
}

class ConcreteClass : SampleInterface {
    override val int1: Int = 2
    override val int2: Int
    get() { return 8 }

    override fun method() {
        println("override")
    }

    override fun methodWithBody() {
        super.methodWithBody()
    }
}