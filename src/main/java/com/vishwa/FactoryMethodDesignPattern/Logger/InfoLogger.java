package com.vishwa.FactoryMethodDesignPattern.Logger;

public class InfoLogger implements Ilogger {

    @Override
    public void log(String msg) {
        System.out.println("Info: " + msg);
    }
}
