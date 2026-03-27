package org.example.structural.composite

import java.awt.Component

class ComponentFolder(private val name: String) : FileSystemComponent {

    private val children = mutableListOf<FileSystemComponent>()

    fun addComponent(component: FileSystemComponent) {
        children.add(component)
    }

    fun removeComponent(component: FileSystemComponent) {
        children.remove(component)
    }

    override fun showDetails() {
        println("Folder: $name")
        children.forEach { it.showDetails() }
    }
}