package org.example.behavioural.state_pattern.state_interface

import org.example.behavioural.state_pattern.Context

interface IState {

    fun handle(context: Context)
}