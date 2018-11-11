package other.type_checks_and_casts

import java.awt.*
import java.awt.geom.*

fun main() {
    val window = object : Frame() {
        override fun paint(g: Graphics) {
            val g2 = g as Graphics2D // Cast
            g2.draw(Line2D.Double(50.0, 50.0, 100.0, 100.0))
            super.paint(g)
        }
    }
    window.run {
        setBounds(0, 0, 200, 200)
        isVisible = true
    }
}