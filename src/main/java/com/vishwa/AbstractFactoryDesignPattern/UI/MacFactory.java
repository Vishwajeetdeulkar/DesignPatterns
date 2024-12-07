package com.vishwa.AbstractFactoryDesignPattern.UI;

public class MacFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
