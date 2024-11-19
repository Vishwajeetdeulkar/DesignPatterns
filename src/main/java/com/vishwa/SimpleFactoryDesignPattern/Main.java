package com.vishwa.SimpleFactoryDesignPattern;

import com.vishwa.SimpleFactoryDesignPattern.logger.ILogger;
import com.vishwa.SimpleFactoryDesignPattern.logger.LogLevel;
import com.vishwa.SimpleFactoryDesignPattern.logger.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        debugLogger.log("Debug message");
        infoLogger.log("Info message");
        errorLogger.log("Error message");
    }
}
