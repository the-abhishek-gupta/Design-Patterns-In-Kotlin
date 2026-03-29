package org.example.behavioural.observer

import org.example.behavioural.observer.observer_interface.MobileApp


class ObserverMain {
    fun main() {
        val channel = NewsChannel()

        val user1 = MobileApp("AbhiApp")
        val user2 = MobileApp("abhi@email.com")

        channel.subscribe(user1)
        channel.subscribe(user2)

        channel.setNews("Observer pattern explained!")
    }
}