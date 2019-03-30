package cn.mwxu.abstractFactoryPattern.bestPractice.factory;

import cn.mwxu.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.PhoneInterface;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract ComputerInterface getComputer();

    public abstract PhoneInterface getPhone();

}
