package org.example.behavioural.state_pattern

import org.example.behavioural.state_pattern.state_interface.IState
import org.example.behavioural.state_pattern.state_interface.StateA

class Context {

    private var state : IState = StateA()

    fun setState(state : IState) {
        this.state = state
    }

    fun request(){
        state.handle(this)
    }
}