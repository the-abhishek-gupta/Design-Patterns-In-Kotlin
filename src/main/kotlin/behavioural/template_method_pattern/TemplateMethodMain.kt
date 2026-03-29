package org.example.behavioural.template_method_pattern

import org.example.behavioural.template_method_pattern.template_abstract.CsvProcessor
import org.example.behavioural.template_method_pattern.template_abstract.JsonProcessor

class TemplateMethodMain {
    fun main() {
        val csv = CsvProcessor()
        csv.process()

        val jsonProcessor = JsonProcessor()
        jsonProcessor.process()
    }
}