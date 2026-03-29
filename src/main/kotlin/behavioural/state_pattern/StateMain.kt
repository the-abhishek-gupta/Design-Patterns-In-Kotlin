package org.example.behavioural.state_pattern

import org.example.behavioural.observer.observer_interface.MobileApp


class StateMain {
    fun main() {
        val context = Context()

        context.request() // A → B
        context.request() // B → C
        context.request() // C → A
        context.request() // A → B
    }
}