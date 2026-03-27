package org.example.structural.facade

import org.example.structural.facade.computer.CPU
import org.example.structural.facade.computer.HardDrive
import org.example.structural.facade.computer.Memory

class ComputerFacade {

    private val cpu = CPU()
    private val memory = Memory()
    private val hardDrive = HardDrive()

    fun start() {
        cpu.freeze()
        memory.load()
        hardDrive.read()
        cpu.execute()
    }
}