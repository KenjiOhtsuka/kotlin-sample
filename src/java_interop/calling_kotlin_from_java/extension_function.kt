@file:JvmName("ExtensionFunction")

package java_interop.calling_kotlin_from_java

@JvmOverloads fun String.surround(prefix: String = "[", suffix: String = "]"): String {
    return "[" + this + "]"
}
