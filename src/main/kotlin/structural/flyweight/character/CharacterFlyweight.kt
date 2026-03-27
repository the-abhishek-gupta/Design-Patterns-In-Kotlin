package org.example.structural.flyweight.character

class CharacterFlyweight(
    private val char: Char,
    private val font: String
) : ICharacter {
    override fun display(position: Int) {
        println("Character: $char, Font: $font, Position: $position")
    }
}