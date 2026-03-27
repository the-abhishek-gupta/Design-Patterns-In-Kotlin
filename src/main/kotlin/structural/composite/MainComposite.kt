package org.example.structural.composite

class MainComposite {
    fun main() {
        val file1 = CompositeFile("f1.jpeg")
        val file2 = CompositeFile("f2.mp3")

        val subFolder = ComponentFolder("my_files")
        subFolder.addComponent(file1)

        val rootFolder = ComponentFolder("root")
        rootFolder.addComponent(file2)
        rootFolder.addComponent(subFolder)

        rootFolder.showDetails()

    }
}