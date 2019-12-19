package com.xumingwei.designPattern.factoryPattern.bestPractice.phone;

/**
 * 华为手机
 */
public class HuaweiPhone implements  PhoneInteface {

    @Override
    public void printBrand() {
        System.out.println("brand : Huawei mate 20");
    }
}
