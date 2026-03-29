package org.example.behavioural.template_method_pattern.template_abstract

class CsvProcessor(private val name : String = "CSV") : DataProcessorAbstract(name) {
    override fun processData() {
        println("Further Processing CSV Data ....")
    }
}