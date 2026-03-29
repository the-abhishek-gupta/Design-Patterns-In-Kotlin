package org.example.behavioural.state_pattern.state_interface

import org.example.behavioural.state_pattern.Context

class StateA : IState {
    override fun handle(context: Context) {
        println("State A handling this")
        context.setState(state = StateB())
    }
}