package org.example.behavioural.chain_of_responsibility_pattern.abstract_handler

class HandlerB : Handler() {
    override fun process(request: String): Boolean {
        if (request == "B") {
            println("Handled by B")
            return true
        }
        return false
    }
}