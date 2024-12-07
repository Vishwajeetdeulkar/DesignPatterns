package com.vishwa.FactoryMethodDesignPattern.Logger;

public class ErrorLoggerFactory implements LoggerFactory {
    @Override
    public Ilogger createLogger(LogLevel level) {
        return new ErrorLogger();
    }
}
