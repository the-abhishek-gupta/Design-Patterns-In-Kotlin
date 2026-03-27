package org.example

import org.example.creational.abstract_factory.AbstractFactoryMain
import org.example.creational.builder.BuilderMain
import org.example.creational.factory.FactoryMain
import org.example.creational.prototype.PrototypeMain
import org.example.creational.singleton.SingletonMain

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    FactoryMain().main()
    AbstractFactoryMain().main()
    BuilderMain().main()
    SingletonMain().main()
    PrototypeMain().main()
}