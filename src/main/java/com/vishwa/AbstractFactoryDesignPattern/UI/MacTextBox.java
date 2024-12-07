package com.vishwa.AbstractFactoryDesignPattern.UI;

public class MacTextBox implements ITextBox {
    @Override
    public void setText(String text) {
        System.out.println("Set text in Mac TextBox: " + text);
    }
}
