package java_interop

fun main(vararg args: String) {
    var i = JavaClass().test()
    if (i != null) i *= 2

    var j = JavaClass().test()
    j += 2 // NullPointerException
}