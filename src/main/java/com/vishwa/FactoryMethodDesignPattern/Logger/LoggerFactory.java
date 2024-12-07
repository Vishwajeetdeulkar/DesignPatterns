package com.vishwa.FactoryMethodDesignPattern.Logger;

public interface LoggerFactory {
    Ilogger createLogger(LogLevel level);
}
