package org.example.behavioural.iterator_pattern.iterator_interface

class MyIterator<T>(private val items: List<T>) : IteratorIntf<T> {
    private var index = 0
    override fun next(): T {
        return items[index++]
    }

    override fun hasNext(): Boolean {
        return index < items.size
    }
}