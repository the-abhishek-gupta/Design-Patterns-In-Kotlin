package org.example.structural.decorator.coffee

abstract class CoffeeDecoratorBase(protected val coffee: Coffee) : Coffee {
    override fun cost(): Double {
        return coffee.cost()
    }

    override fun description(): String {
        return coffee.description()
    }
}