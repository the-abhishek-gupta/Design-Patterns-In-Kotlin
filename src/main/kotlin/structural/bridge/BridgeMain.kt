package org.example.structural.bridge

import org.example.structural.bridge.color.BlueColor
import org.example.structural.bridge.color.RedColor
import org.example.structural.bridge.shape.ColoredCircle
import org.example.structural.bridge.shape.ColoredSquare

class BridgeMain {
    fun main() {
        val redCircle = ColoredCircle(RedColor())
        val blueSquare = ColoredSquare(BlueColor())

        redCircle.draw()
        blueSquare.draw()
    }
}