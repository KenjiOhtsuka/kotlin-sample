package classes_and_objects.objects

import java.awt.*
import java.awt.event.MouseEvent
import java.awt.event.MouseListener


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
}