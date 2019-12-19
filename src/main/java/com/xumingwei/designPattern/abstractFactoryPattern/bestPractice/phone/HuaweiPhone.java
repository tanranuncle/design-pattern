package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone;

/**
 * 华为手机
 */
public class HuaweiPhone implements PhoneInterface {

    @Override
    public void printBrandAndName() {
        System.out.println("Huawei phone : Huawei mate 20");
    }
}
