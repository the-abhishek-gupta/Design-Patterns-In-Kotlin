package org.example.behavioural.state_pattern.state_interface

import org.example.behavioural.state_pattern.Context

class StateB : IState {
    override fun handle(context: Context) {
        println("State B handling this")
        context.setState(state = StateC())
    }
}