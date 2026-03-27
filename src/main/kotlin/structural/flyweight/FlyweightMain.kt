package org.example.structural.flyweight


class FlyweightMain {
    fun main() {
        val c1 = CharacterFactory.getCharacter('A', "Arial")
        val c2 = CharacterFactory.getCharacter('A', "Arial")
        val c3 = CharacterFactory.getCharacter('B', "Arial")

        c1.display(1)
        c2.display(2)
        c3.display(3)
    }
}