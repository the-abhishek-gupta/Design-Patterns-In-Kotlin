package org.example.behavioural.observer.observer_interface

class EmailService(private val email: String) : IObserver {
    override fun update(data: String) {
        println("$email received email : $data")
    }
}