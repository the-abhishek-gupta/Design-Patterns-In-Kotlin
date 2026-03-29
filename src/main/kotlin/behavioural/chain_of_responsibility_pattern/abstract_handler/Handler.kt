package org.example.behavioural.chain_of_responsibility_pattern.abstract_handler

abstract class Handler {

    private var handler: Handler? = null

    fun setNextHandler(handler: Handler): Handler {
        this.handler = handler
        return handler
    }

    fun handleRequest(request: String) {
        if (process(request)) return
        handler?.handleRequest(request) ?: println("$request not handled")
    }

    protected abstract fun process(request: String): Boolean

}