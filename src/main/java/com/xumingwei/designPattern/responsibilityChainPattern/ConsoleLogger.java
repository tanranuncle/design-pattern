package com.xumingwei.designPattern.responsibilityChainPattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 21:11
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
