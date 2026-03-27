package org.example.structural.decorator.coffee.decorators

import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.CoffeeDecoratorBase

class SugarDecorator(coffee: Coffee) : CoffeeDecoratorBase(coffee) {
    override fun description(): String {
        return super.description() + " + Sugar "
    }

    override fun cost(): Double {
        return super.cost() + 1.5
    }
}