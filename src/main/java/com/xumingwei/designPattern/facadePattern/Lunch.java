package com.xumingwei.designPattern.facadePattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 18:50
 */
public class Lunch implements Eat {
    @Override
    public void eat() {
        System.out.println("吃午饭");
    }
}
