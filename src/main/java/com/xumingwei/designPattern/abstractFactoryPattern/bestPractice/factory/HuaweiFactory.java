package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory;

import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.computer.HuaweiComputer;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone.HuaweiPhone;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone.PhoneInterface;

/**
 * 华为产品工厂
 */
public class HuaweiFactory extends AbstractFactory {

    @Override
    public ComputerInterface getComputer() {
        return new HuaweiComputer();
    }

    @Override
    public PhoneInterface getPhone() {
        return new HuaweiPhone();
    }
}
