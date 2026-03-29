package org.example.behavioural.command.command_interface

import org.example.behavioural.command.receiver.LightCommandReceiver

class TurnOnCommand(private val light : LightCommandReceiver) : ICommand {
    override fun execute() {
        light.turnOn()
    }

    override fun undo() {
        light.turnOff()
    }
}