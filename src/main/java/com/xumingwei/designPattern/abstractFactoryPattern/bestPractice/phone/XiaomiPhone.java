package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone;

/**
 * 小米手机
 */
public class XiaomiPhone implements  PhoneInterface {

    @Override
    public void printBrandAndName() {
        System.out.println("Xiaomi phone : Xiaomi 9");
    }
}
