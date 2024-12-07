package com.vishwa.FactoryMethodDesignPattern.Logger;

public class ErrorLogger implements Ilogger {
    @Override
    public void log(String msg) {
        System.out.println("Error: " + msg);
    }
}
