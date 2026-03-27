package org.example.structural.bridge.shape

import org.example.structural.bridge.color.Color


class ColoredSquare(color: Color): BridgeShape(color) {
    override fun draw() {
        val colorOfSquare = color.applyColor()
        println("Drawing a $colorOfSquare square")
    }
}