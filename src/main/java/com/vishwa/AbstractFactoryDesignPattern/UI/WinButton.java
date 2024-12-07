package com.vishwa.AbstractFactoryDesignPattern.UI;

public class WinButton implements IButton {
    @Override
    public void press() {
        System.out.println("Pressed Windows Button");
    }
}
