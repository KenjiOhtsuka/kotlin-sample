package other.this_espressions

class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            println(a.javaClass)
            val b = this@B // B's this
            println(b.javaClass)

            val c = this // foo()'s receiver, an Int
            println(c)
            val c1 = this@foo // foo()'s receiver, an Int
            println(c1)

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
                println(this)
            }

            "hello".funLit()


            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
                println(this)
            }
            funLit2("test")
        }

        fun test() {
            111111.foo()
        }
    }
    fun test() {
        val b = B()
        b.test()
    }
}

fun main(args: Array<String>) {
    val a = A()
    a.test()
}