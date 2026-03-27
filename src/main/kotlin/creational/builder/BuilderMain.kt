package org.example.creational.builder

class BuilderMain {
    fun main() {
        val user1 = User.Builder("Abhishek").setAge(29).setEmail("abhi@abhi.com").isActive(true).build()
        // In Kotlin, data class with default arguements work as same
        val user2 = UserData("Abhishek Gupta")
        println("User: $user1")
        println("User2: $user2")
    }
}
data class UserData(
    val name: String,
    val age: Int? = null,
    val email: String? = null,
    val isActive: Boolean = false
)