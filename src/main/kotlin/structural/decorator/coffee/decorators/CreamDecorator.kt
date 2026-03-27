package org.example.structural.decorator.coffee.decorators

import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.CoffeeDecoratorBase

class CreamDecorator(coffee: Coffee) : CoffeeDecoratorBase(coffee) {
    override fun description(): String {
        return super.description() + " + Cream "
    }

    override fun cost(): Double {
        return super.cost() + 1.0
    }
}