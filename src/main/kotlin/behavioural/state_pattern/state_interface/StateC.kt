package org.example.behavioural.state_pattern.state_interface

import org.example.behavioural.state_pattern.Context

class StateC : IState {
    override fun handle(context: Context) {
        println("State C handling this")
        context.setState(StateA())
    }
}