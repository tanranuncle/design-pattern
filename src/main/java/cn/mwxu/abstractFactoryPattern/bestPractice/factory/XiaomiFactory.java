package cn.mwxu.abstractFactoryPattern.bestPractice.factory;

import cn.mwxu.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import cn.mwxu.abstractFactoryPattern.bestPractice.computer.XiaomiComputer;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.PhoneInterface;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.XiaomiPhone;

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
