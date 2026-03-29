package org.example.behavioural.mediator_pattern.mediator_interface

import org.example.behavioural.mediator_pattern.ChatUser

interface IChatMediator {
    fun sendMessage(message: String, sender : ChatUser)
    fun addUser(user : ChatUser)
}