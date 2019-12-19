package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory;

import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.computer.XiaomiComputer;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone.PhoneInterface;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone.XiaomiPhone;

/**
 * 小米产品工厂
 */
public class XiaomiFactory extends AbstractFactory {

    @Override
    public ComputerInterface getComputer() {
        return new XiaomiComputer();
    }

    @Override
    public PhoneInterface getPhone() {
        return new XiaomiPhone();
    }
}
