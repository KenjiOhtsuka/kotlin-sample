package stdlib

object IteratorExample : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int> {
            val intArray = intArrayOf(1, 2, 3, 4, 5)
            var index = -1

            override fun hasNext(): Boolean {
                return index + 1 < intArray.size
            }

            override fun next(): Int {
                return intArray[++index]
            }
        }
    }
}

fun main() {
    IteratorExample.forEach { println(it) }
}