package com.vishwa.AbstractFactoryDesignPattern.UI;

public class WinFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WinTextBox();
    }
}
