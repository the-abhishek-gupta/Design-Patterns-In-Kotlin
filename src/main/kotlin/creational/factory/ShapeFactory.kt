package org.example.creational.factory

object ShapeFactory {
    fun createShape(type: ShapeType): Shape {
        return when (type) {
            ShapeType.Circle -> Circle()
            ShapeType.Square -> Square()
        }
    }
}

sealed class ShapeType {
    object Circle : ShapeType()
    object Square : ShapeType()
}