package org.example.behavioural.memento_pattern

class TextEditor {

    private var txt: String = ""

    fun write(newText: String) {
        txt += newText
    }

    fun getText(): String = txt

    fun save(): Memento {
        return Memento(txt)
    }

    fun restore(memento: Memento) {
        txt = memento.state
    }
}