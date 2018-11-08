package classes_and_objects.objects

import java.awt.*
import java.awt.event.MouseEvent
import java.awt.event.MouseListener


class CompanionObjectSample {
    object A {
        fun a() {
            println("a")
        }
    }

    companion object B {
        fun b() {
            println("b")
        }
    }

    init {
        A.a()
    }
}

fun main() {
    // Object Expression Example
    Frame().run {
        setSize(300, 300)
        addMouseListener(object : MouseListener {
            override fun mouseReleased(e: MouseEvent?) {}
            override fun mouseEntered(e: MouseEvent?) {}
            override fun mouseClicked(e: MouseEvent?) {
                println("Hello")
            }
            override fun mouseExited(e: MouseEvent?) {}
            override fun mousePressed(e: MouseEvent?) {}
        })
        isVisible = true
    }

    // Companion Object Example
    CompanionObjectSample.A.a()
    // CompanionObjectSample.a() => Error
    CompanionObjectSample.b()
    CompanionObjectSample.B.b()
}