package org.example.structural.bridge.shape

import org.example.structural.bridge.color.Color

class ColoredCircle(color: Color) : BridgeShape(color) {
    override fun draw() {
        val colorOfCirle = color.applyColor()
        println("Drawing a $colorOfCirle cirle")
    }
}