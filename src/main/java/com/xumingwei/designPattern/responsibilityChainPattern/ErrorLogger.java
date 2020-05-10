package com.xumingwei.designPattern.responsibilityChainPattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 21:14
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
