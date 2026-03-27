package org.example.structural.facade

import org.example.structural.composite.ComponentFolder
import org.example.structural.composite.CompositeFile
import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.SimpleCoffee
import org.example.structural.decorator.coffee.decorators.CreamDecorator
import org.example.structural.decorator.coffee.decorators.MilkDecorator
import org.example.structural.decorator.coffee.decorators.SugarDecorator

class FacadeMain {
    fun main() {
        val computer = ComputerFacade()
        computer.start()
    }
}