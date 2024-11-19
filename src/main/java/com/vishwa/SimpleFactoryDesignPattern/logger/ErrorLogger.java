package com.vishwa.SimpleFactoryDesignPattern.logger;

public class ErrorLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("Error: " + msg);
    }
}
