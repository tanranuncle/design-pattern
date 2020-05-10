package com.xumingwei.designPattern.responsibilityChainPattern;

import org.junit.Test;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 21:15
 */
public class ResponsibilityChainPatternTest {

    @Test
    public void test(){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }

    //初始化责任链的关系。也可以在每个接收者中直接写死它的下一个接收者是谁
    private AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
