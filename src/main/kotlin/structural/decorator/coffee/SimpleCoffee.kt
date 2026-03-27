package org.example.structural.decorator.coffee

class SimpleCoffee : Coffee {
    override fun cost(): Double {
        return 10.0
    }

    override fun description(): String {
        return "Simple Coffee"
    }
}