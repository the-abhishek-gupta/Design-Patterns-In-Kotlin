package org.example.structural.flyweight

import org.example.structural.flyweight.character.CharacterFlyweight
import org.example.structural.flyweight.character.ICharacter

object CharacterFactory {
    private val cache = mutableMapOf<String, ICharacter>()

    fun getCharacter(char: Char, font: String): ICharacter {
        val key = "$char-$font"

        return cache.getOrPut(key) {
            println("Creating new character: $key")
            CharacterFlyweight(char, font)
        }
    }
}