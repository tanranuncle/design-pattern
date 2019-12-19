package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory;

import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.phone.PhoneInterface;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract ComputerInterface getComputer();

    public abstract PhoneInterface getPhone();

}
