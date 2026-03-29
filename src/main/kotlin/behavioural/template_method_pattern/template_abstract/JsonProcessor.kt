package org.example.behavioural.template_method_pattern.template_abstract

class JsonProcessor(private val name : String = "JSON") : DataProcessorAbstract(name) {
    override fun processData() {
        println("Next Processing .... JSON Data")
    }
}