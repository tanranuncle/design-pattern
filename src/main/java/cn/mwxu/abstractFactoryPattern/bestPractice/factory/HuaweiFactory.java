package cn.mwxu.abstractFactoryPattern.bestPractice.factory;

import cn.mwxu.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import cn.mwxu.abstractFactoryPattern.bestPractice.computer.HuaweiComputer;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.HuaweiPhone;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.PhoneInterface;

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
