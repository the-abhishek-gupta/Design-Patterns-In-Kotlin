package org.example.creational

import org.example.creational.abstract_factory.AbstractFactoryMain
import org.example.creational.builder.BuilderMain
import org.example.creational.factory.FactoryMain
import org.example.creational.prototype.PrototypeMain
import org.example.creational.singleton.SingletonMain

class CreationalMain {
    fun main(){
        FactoryMain().main()
        AbstractFactoryMain().main()
        BuilderMain().main()
        SingletonMain().main()
        PrototypeMain().main()
    }
}