package classes_and_objects.delegated_properties

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main(args: Array<String>) {
    // getter, setter delegation
    val e = Example()
    println(e.p)
    e.p = "test"

    // standard delegation
    println(lazyValue)
    println(lazyValue)

    // observable
    val user = User()
    user.name = "first"
    user.name = "second"
}