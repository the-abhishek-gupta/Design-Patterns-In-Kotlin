package org.example.creational.abstract_factory

object FactoryProvider {
    fun getFactory(platform : Platform) : UIFactory{
        return when (platform) {
            Platform.Android -> AndroidFactory()
            Platform.IOS -> IOSFactory()
        }

    }
}
sealed class Platform{
    object Android : Platform()
    object IOS : Platform()
}