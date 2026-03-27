package org.example.structural.proxy

import org.example.structural.proxy.image.Image
import org.example.structural.proxy.image.RealImage

class ProxyImage(val fileName: String) : Image {
    private var realImage: RealImage? = null
    override fun display() {
        if (realImage == null) {
            realImage = RealImage(fileName)
        }
        realImage?.display()
    }
}