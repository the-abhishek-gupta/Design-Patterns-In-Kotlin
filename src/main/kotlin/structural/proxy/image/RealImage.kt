package org.example.structural.proxy.image

class RealImage(val fileName: String) : Image {
    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Loading $fileName from disk")
    }

    override fun display() {
        println("Displaying image: $fileName")
    }
}