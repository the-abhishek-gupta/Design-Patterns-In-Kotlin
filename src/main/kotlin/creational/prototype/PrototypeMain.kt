package org.example.creational.prototype

class PrototypeMain {
    fun main() {
        val user1 = ProtoUser(name = "Abhishek", address = ProtoAddress("Gurgoan", "122001"))
        val clonedUser = user1.clone()

        println("Original: $user1")
        println("Cloned: $clonedUser")

        // Modify clone
        val modified = clonedUser.copy(
            name = "Rahul",
            address = clonedUser.address.copy(city = "Delhi")
        )

        println("Modified Clone: $modified")
    }
}