package org.example.behavioural.iterator_pattern

class IteratorMain {

    fun main() {
        val collection = MyCollection(listOf("A", "B", "C"))
        val iterator = collection.getIterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            println(item)
        }
    }
}