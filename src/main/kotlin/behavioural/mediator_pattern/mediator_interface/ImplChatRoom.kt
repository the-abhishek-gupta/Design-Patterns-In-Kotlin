package org.example.behavioural.mediator_pattern.mediator_interface

import org.example.behavioural.mediator_pattern.ChatUser

class ImplChatRoom : IChatMediator {
    private val users = mutableListOf<ChatUser>()
    override fun sendMessage(message: String, sender: ChatUser) {
        users.filter { it != sender }.forEach { user ->
            user.receive(message)
        }
    }

    override fun addUser(user: ChatUser) {
        users.add(user)
    }
}