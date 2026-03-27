package org.example.structural.proxy

import org.example.structural.composite.ComponentFolder
import org.example.structural.composite.CompositeFile
import org.example.structural.decorator.coffee.Coffee
import org.example.structural.decorator.coffee.SimpleCoffee
import org.example.structural.decorator.coffee.decorators.CreamDecorator
import org.example.structural.decorator.coffee.decorators.MilkDecorator
import org.example.structural.decorator.coffee.decorators.SugarDecorator
import org.example.structural.facade.ComputerFacade
import org.example.structural.proxy.image.Image

class ProxyMain {
    fun main() {
        val image: Image = ProxyImage("photo.jpg")

        // No loading yet
        println("Image created")

        println("...")
        // Load happens here
        image.display()
        println("...")

        // No re-loading
        image.display()
    }
}