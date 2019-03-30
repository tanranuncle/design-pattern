package cn.mwxu.abstractFactoryPattern;

import cn.mwxu.abstractFactoryPattern.bestPractice.factory.AbstractFactory;
import cn.mwxu.abstractFactoryPattern.bestPractice.FactoryProducer;
import cn.mwxu.abstractFactoryPattern.bestPractice.computer.ComputerInterface;
import cn.mwxu.abstractFactoryPattern.bestPractice.phone.PhoneInterface;
import org.junit.Test;

/**
 * 测试抽象工厂模式
 */
public class AbstractFactoryPatternTest {

    @Test
    public void testAbstractFactoryPattern(){
        //准备华为产品工厂
        AbstractFactory huaweiFactory = FactoryProducer.getFactory("Huawei");

        //生产一部华为手机
        PhoneInterface huaweiPhone = huaweiFactory.getPhone();

        //显示手机品牌
        huaweiPhone.printBrandAndName();

        //再生产一台华为电脑
        ComputerInterface huaweiComputer = huaweiFactory.getComputer();

        //显示电脑品牌
        huaweiComputer.printBrandAndName();

        //准备小米产品工厂
        AbstractFactory xiaomiFactory = FactoryProducer.getFactory("Xiaomi");

        //生产一部小米手机
        PhoneInterface xiaomiPhone = xiaomiFactory.getPhone();

        //显示手机品牌
        xiaomiPhone.printBrandAndName();

        //再生产一台小米电脑
        ComputerInterface xiaomiComputer = xiaomiFactory.getComputer();

        //显示电脑品牌
        xiaomiComputer.printBrandAndName();



    }
}
