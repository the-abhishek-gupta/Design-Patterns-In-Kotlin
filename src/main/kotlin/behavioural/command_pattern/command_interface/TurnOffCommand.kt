package org.example.behavioural.command.command_interface

import org.example.behavioural.command.receiver.LightCommandReceiver

class TurnOffCommand(private val light : LightCommandReceiver) : ICommand {
    override fun execute() {
        light.turnOff()
    }

    override fun undo() {
        light.turnOn()
    }
}