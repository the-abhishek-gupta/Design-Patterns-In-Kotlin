package org.example.behavioural.command

import org.example.behavioural.command.command_interface.ICommand

class RemoteControlService {
    private var command: ICommand? = null
    fun setCommand(command: ICommand) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }

    fun pressUndo() {
        command?.undo()
    }
}