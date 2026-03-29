package org.example.behavioural.mediator_pattern

import org.example.behavioural.mediator_pattern.mediator_interface.IChatMediator

class ChatUser(private val name: String, private val mediator: IChatMediator) {
    fun sendMessage(message: String) {
        mediator.sendMessage(message, this)
    }

    fun receive(message: String) {
        println("$message received by $name")
    }
}