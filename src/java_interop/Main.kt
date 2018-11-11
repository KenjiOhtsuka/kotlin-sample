package java_interop

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.lang.Exception
import java.lang.Thread.sleep

fun main(vararg args: String) {
    val javaClass = JavaClass()

    var i = javaClass.test()
    if (i != null) i *= 2

    try {
        var j = javaClass.test()
        j += 2 // NullPointerException
    } catch (e: Exception) {
        println(e.message)
    }

    var k = javaClass.calc(null)

    /* Single Abstract Method Conversion Example */
    val thread1 = Thread { println("thread 1") }
    thread1.start()
    val thread2 = Thread(object : Runnable {
        override fun run() {
            println("thread 2")
        }
    })
    thread2.start()

    /* Single Abstract Method Conversion Example */
//    Frame().run {
//        setBounds(0, 0, 200, 200)
//        layout = FlowLayout()
//        add(Button("button 1").apply {
//            addActionListener {
//                println("action 1")
//            }
//        })
//
//        add(Button("button 2").apply {
//            addActionListener(object : ActionListener {
//                override fun actionPerformed(e: ActionEvent?) {
//                    println("action 2")
//                }
//            })
//        })
//
//        isVisible = true
//    }
}
