package org.example.behavioural.mediator_pattern

import org.example.behavioural.mediator_pattern.mediator_interface.ImplChatRoom

class MediatorMain {
    fun main() {
        val chatRoom = ImplChatRoom()

        val user1 = ChatUser("Abhishek", chatRoom)
        val user2 = ChatUser("Rahul", chatRoom)
        val user3 = ChatUser("Amit", chatRoom)

        chatRoom.addUser(user1)
        chatRoom.addUser(user2)
        chatRoom.addUser(user3)

        user1.sendMessage("Hello everyone!")
    }
}