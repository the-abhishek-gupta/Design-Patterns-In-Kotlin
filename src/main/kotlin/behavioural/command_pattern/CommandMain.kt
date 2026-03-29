package org.example.behavioural.command

import org.example.behavioural.command.command_interface.TurnOffCommand
import org.example.behavioural.command.command_interface.TurnOnCommand
import org.example.behavioural.command.receiver.LightCommandReceiver

class CommandMain {
    fun main(){

        val light = LightCommandReceiver()

        val turnOnCommand = TurnOnCommand(light)
        val turnOffCommand = TurnOffCommand(light)

        val remoteControlService = RemoteControlService()

        remoteControlService.setCommand(turnOnCommand)
        remoteControlService.pressButton()
        remoteControlService.pressUndo()

        remoteControlService.setCommand(turnOffCommand)
        remoteControlService.pressButton()
        remoteControlService.pressUndo()

    }
}