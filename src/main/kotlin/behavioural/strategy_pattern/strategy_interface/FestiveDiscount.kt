package org.example.behavioural.strategy.strategy_interface

class FestiveDiscount : PricingStrategy {
    override fun calculatePrice(price: Double): Double {
        return price * 0.9
    }
}