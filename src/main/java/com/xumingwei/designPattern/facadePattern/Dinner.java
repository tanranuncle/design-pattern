package com.xumingwei.designPattern.facadePattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 18:51
 */
public class Dinner implements Eat {
    @Override
    public void eat() {
        System.out.println("吃晚饭");
    }
}
