package com.vishwa.AbstractFactoryDesignPattern.UI;

public class MacButton implements IButton {

    @Override
    public void press() {
        System.out.println("Pressed Mac Button");
    }
}
