package org.example.creational.abstract_factory

import org.example.creational.abstract_factory.button.IOSButton
import org.example.creational.abstract_factory.button.UIButton
import org.example.creational.abstract_factory.checkbox.IOSCheckBox
import org.example.creational.abstract_factory.checkbox.UICheckbox

class IOSFactory : UIFactory {
    override fun createButton(): UIButton {
        return IOSButton()
    }

    override fun createCheckbox(): UICheckbox {
        return IOSCheckBox()
    }
}