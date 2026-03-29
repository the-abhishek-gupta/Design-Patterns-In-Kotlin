package org.example.behavioural.chain_of_responsibility_pattern

import org.example.behavioural.chain_of_responsibility_pattern.abstract_handler.HandlerA
import org.example.behavioural.chain_of_responsibility_pattern.abstract_handler.HandlerB
import org.example.behavioural.chain_of_responsibility_pattern.abstract_handler.HandlerC

class MainCOR {
    fun main(){
        val handlerA = HandlerA()
        val handlerB = HandlerB()
        val handlerC = HandlerC()

        handlerA.setNextHandler(handlerB).setNextHandler(handlerC)

        val chain = handlerA // ✅ ROOT
        chain.handleRequest("A")
        println("....")
        chain.handleRequest("B")
        println("....")
        chain.handleRequest("C")
        println("....")
        chain.handleRequest("D")
        println("....")
    }
}