package org.example.behavioural.iterator_pattern.iterator_interface

interface IteratorIntf<T> {
    fun hasNext(): Boolean
    fun next() : T
}