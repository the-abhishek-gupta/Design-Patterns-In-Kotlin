package org.example.structural.composite

class CompositeFile(private val name : String) : FileSystemComponent {
    override fun showDetails() {
        println("File: $name")
    }
}