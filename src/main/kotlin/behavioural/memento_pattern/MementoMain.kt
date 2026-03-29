package org.example.behavioural.memento_pattern

class MementoMain {
    fun main(){
        val editor = TextEditor()
        val history = History()

        editor.write("Hello ")
        history.save(editor.save())

        editor.write("World ")
        history.save(editor.save())

        editor.write("!!!")

        println("Current: ${editor.getText()}")

        editor.restore(history.undo()!!)
        println("After Undo: ${editor.getText()}")

        editor.restore(history.undo()!!)
        println("After Undo: ${editor.getText()}")
    }
}