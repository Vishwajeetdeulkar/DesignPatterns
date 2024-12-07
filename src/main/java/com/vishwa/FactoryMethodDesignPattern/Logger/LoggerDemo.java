package com.vishwa.FactoryMethodDesignPattern.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DebugLoggerFactory();
        Ilogger logger = loggerFactory.createLogger(LogLevel.DEBUG);
        logger.log("Hello World");
    }
}
