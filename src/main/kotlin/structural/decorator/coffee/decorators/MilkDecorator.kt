package org.example.structural.decorator.coffee.decorators

import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.CoffeeDecoratorBase

class MilkDecorator(coffee: Coffee) : CoffeeDecoratorBase(coffee) {
    override fun description(): String {
        return super.description() + " + Milk "
    }

    override fun cost(): Double {
        return super.cost() + 5.0
    }
}