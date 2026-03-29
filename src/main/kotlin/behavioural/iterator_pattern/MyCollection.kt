package org.example.behavioural.iterator_pattern

import org.example.behavioural.iterator_pattern.iterator_interface.IteratorIntf
import org.example.behavioural.iterator_pattern.iterator_interface.MyIterator


class MyCollection<T>(private val items: List<T>) {

    fun getIterator(): IteratorIntf<T>{
        return MyIterator(items)
    }
}