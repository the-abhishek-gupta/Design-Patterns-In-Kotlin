package org.example.creational.builder

class User private constructor(
    val name: String,
    val age: Int?,
    val email: String?,
    val isActive: Boolean
) {
    class Builder(private val name: String) {
        private var age: Int? = null
        private var email: String? = null
        private var isActive: Boolean = false

        fun setAge(age: Int) = apply {
            this.age = age
        }

        fun setEmail(email: String) = apply {
            this.email = email
        }

        fun isActive(isActive: Boolean) = apply {
            this.isActive = isActive
        }

        fun build(): User {
            return User(name, age, email, isActive)
        }
    }
}