package org.example.behavioural.strategy.strategy_interface

class NoDiscount : PricingStrategy {
    override fun calculatePrice(price: Double): Double {
        return price
    }
}