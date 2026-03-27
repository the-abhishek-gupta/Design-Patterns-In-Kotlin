package org.example.structural.bridge.shape

import org.example.structural.bridge.color.Color

abstract class BridgeShape(protected val color: Color) {
    abstract fun draw()
}