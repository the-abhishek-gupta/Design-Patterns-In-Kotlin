package org.example.creational.abstract_factory

import org.example.creational.abstract_factory.button.UIButton
import org.example.creational.abstract_factory.checkbox.UICheckbox

interface UIFactory {
    fun createButton(): UIButton
    fun createCheckbox(): UICheckbox
}