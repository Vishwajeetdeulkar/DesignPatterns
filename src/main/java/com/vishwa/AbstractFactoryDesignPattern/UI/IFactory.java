package com.vishwa.AbstractFactoryDesignPattern.UI;

public interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
