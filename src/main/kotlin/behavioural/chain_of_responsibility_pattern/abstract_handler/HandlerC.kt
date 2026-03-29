package org.example.behavioural.chain_of_responsibility_pattern.abstract_handler

class HandlerC : Handler() {
    override fun process(request: String): Boolean {
        if (request == "C") {
            println("Handled by C")
            return true
        }
        return false
    }
}