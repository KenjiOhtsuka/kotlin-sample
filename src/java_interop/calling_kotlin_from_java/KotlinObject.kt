package java_interop.calling_kotlin_from_java

object KotlinObject {
    val notStaticValue = 1
    @JvmStatic val staticValue = 1
    fun notStaticFunction() { /* Code */ }
    @JvmStatic fun staticFunction() { /* Code */ }
}