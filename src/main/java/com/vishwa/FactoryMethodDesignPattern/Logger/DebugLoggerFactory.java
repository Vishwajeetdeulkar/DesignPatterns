package com.vishwa.FactoryMethodDesignPattern.Logger;

public class DebugLoggerFactory implements LoggerFactory {
    @Override
    public Ilogger createLogger(LogLevel level) {
        return new DebugLogger();
    }
}
