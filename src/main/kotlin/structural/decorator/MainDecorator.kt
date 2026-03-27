package org.example.structural.decorator

import org.example.structural.composite.ComponentFolder
import org.example.structural.composite.CompositeFile
import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.SimpleCoffee
import org.example.structural.decorator.coffee.decorators.CreamDecorator
import org.example.structural.decorator.coffee.decorators.MilkDecorator
import org.example.structural.decorator.coffee.decorators.SugarDecorator

class MainDecorator {
    fun main() {
        var coffee: Coffee = SimpleCoffee()

        println("${coffee.description()} = ₹${coffee.cost()}")

        coffee = MilkDecorator(coffee)
        coffee = SugarDecorator(coffee)
        coffee = CreamDecorator(coffee)
        println("${coffee.description()} = ₹${coffee.cost()}")

    }
}