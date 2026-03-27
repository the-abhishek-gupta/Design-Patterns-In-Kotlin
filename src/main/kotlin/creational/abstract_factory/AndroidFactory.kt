package org.example.creational.abstract_factory

import org.example.creational.abstract_factory.button.AndroidButton
import org.example.creational.abstract_factory.button.UIButton
import org.example.creational.abstract_factory.checkbox.AndroidCheckBox
import org.example.creational.abstract_factory.checkbox.UICheckbox

class AndroidFactory : UIFactory {
    override fun createButton(): UIButton {
        return AndroidButton()
    }

    override fun createCheckbox(): UICheckbox {
        return AndroidCheckBox()
    }
}