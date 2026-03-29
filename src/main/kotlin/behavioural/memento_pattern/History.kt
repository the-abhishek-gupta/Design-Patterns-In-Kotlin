package org.example.behavioural.memento_pattern

class History {
    private val mementos = mutableListOf<Memento>()
    fun save(memento: Memento) {
        mementos.add(memento)
    }

    fun undo(): Memento? {
        if (mementos.isNotEmpty()) {
            return mementos.removeAt(mementos.lastIndex)
        }
        return null
    }
}