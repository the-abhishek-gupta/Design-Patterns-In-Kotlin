package org.example.behavioural.strategy

import org.example.behavioural.observer.NewsChannel
import org.example.behavioural.observer.observer_interface.MobileApp
import org.example.behavioural.strategy.strategy_interface.EmployeeDiscount
import org.example.behavioural.strategy.strategy_interface.FestiveDiscount
import org.example.behavioural.strategy.strategy_interface.NoDiscount


class StrategyMain {
    fun main() {
        val cart = ShoppingCart(NoDiscount())

        println("No Discount: ${cart.checkout(1000.0)}")

        cart.setStrategy(EmployeeDiscount())
        println("Employee Discount: ${cart.checkout(1000.0)}")

        cart.setStrategy(FestiveDiscount())
        println("Festive Discount: ${cart.checkout(1000.0)}")

    }
}