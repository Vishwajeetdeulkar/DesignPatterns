package com.vishwa.AbstractFactoryDesignPattern.UI;

public class WinTextBox implements ITextBox {
    @Override
    public void setText(String text) {
        System.out.println("Set text in Windows TextBox: " + text);
    }
}
