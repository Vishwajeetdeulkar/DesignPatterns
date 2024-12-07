package com.vishwa.FactoryMethodDesignPattern.Logger;

public class InfoLoggerFactory implements LoggerFactory {
    @Override
    public Ilogger createLogger(LogLevel level) {
        return new InfoLogger();
    }
}
