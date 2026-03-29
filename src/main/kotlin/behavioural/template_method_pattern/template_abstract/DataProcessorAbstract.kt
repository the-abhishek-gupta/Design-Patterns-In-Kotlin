package org.example.behavioural.template_method_pattern.template_abstract

abstract class DataProcessorAbstract(private val name : String) {
    fun process(){
        readData()
        processData()
        saveData()
    }
    fun readData(){
        println("Reading $name data")
    }
    abstract fun processData()

    fun saveData(){
        println("Saving $name data")
    }
}