package com.xumingwei.designPattern.responsibilityChainPattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 21:13
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
