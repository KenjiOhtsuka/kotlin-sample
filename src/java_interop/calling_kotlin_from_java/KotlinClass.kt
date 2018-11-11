package java_interop.calling_kotlin_from_java

class KotlinClass {
    var property: Int = 1
    @JvmField var field: Int = 1

    companion object {
        val notStaticValue = 1
        @JvmStatic val staticValue = 1


        fun notStaticFucntion() {

        }
        @JvmStatic fun staticFunction() {

        }
    }
}