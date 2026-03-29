package org.example.behavioural.strategy.strategy_interface

interface PricingStrategy {
    fun calculatePrice(price: Double): Double
}