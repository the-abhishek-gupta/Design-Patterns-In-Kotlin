package org.example.behavioural.observer.observer_interface

class MobileApp(private val name: String) : IObserver {
    override fun update(data: String) {
        println("$name received news : $data")
    }
}