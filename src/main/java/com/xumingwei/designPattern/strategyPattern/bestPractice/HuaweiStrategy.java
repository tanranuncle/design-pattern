package com.xumingwei.designPattern.strategyPattern.bestPractice;

/**
 * Huawei生产线
 */
public class HuaweiStrategy implements Strategy {

    public void printBrand() {
        System.out.println("正在生产Huawei手机");
    }
}
