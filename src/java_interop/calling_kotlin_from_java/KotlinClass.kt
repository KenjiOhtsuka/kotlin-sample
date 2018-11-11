package java_interop.calling_kotlin_from_java

class KotlinClass {
    companion object {
        val notStaticValue = 1
        @JvmStatic val staticValue = 1


        fun notStaticFucntion() {

        }
        @JvmStatic fun staticFunction() {

        }
    }
}