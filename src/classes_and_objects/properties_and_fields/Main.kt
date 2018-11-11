package classes_and_objects.properties_and_fields

lateinit var value: String

fun main() {
    println(value) // UninitializedPropertyAccessException
}