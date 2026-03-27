package org.example.creational.factory

class FactoryMain {
    fun main() {
        val shape = ShapeFactory.createShape(ShapeType.Circle)
        shape.draw()
    }
}