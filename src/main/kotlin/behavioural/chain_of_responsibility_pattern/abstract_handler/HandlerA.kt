package org.example.behavioural.chain_of_responsibility_pattern.abstract_handler

class HandlerA : Handler() {
    override fun process(request: String): Boolean {
        if (request == "A") {
            println("Handled by A")
            return true
        }
        return false
    }
}