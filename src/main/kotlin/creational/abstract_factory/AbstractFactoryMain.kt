package org.example.creational.abstract_factory

class AbstractFactoryMain {
    fun main() {
        val androidFactory = FactoryProvider.getFactory(Platform.Android)
        renderUI(androidFactory)

        val iosFactory = FactoryProvider.getFactory(Platform.IOS)
        renderUI(iosFactory)

    }

    fun renderUI(factory: UIFactory) {
        val button = factory.createButton()
        val checkbox = factory.createCheckbox()
        button.render()
        checkbox.render()
    }
}