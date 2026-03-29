package org.example.behavioural.strategy

import org.example.behavioural.strategy.strategy_interface.PricingStrategy

class ShoppingCart(private var strategy: PricingStrategy) {
    fun setStrategy(strategy: PricingStrategy) {
        this.strategy = strategy
    }

    fun checkout(price: Double): Double {
        return strategy.calculatePrice(price = price)
    }
}