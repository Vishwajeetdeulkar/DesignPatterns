package com.vishwa.FactoryMethodDesignPattern.Logger;

public class DebugLogger implements Ilogger {
    @Override
    public void log(String msg) {
        System.out.println("DEBUG: "+ msg);
    }
}
