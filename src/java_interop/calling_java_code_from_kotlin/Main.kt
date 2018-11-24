package java_interop.calling_java_code_from_kotlin

fun main() {
    val list = JavaType.list()
    list.add(1)
    list.forEach { println(it) }
}