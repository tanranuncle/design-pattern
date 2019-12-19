package com.xumingwei.designPattern.factoryPattern;

import com.xumingwei.designPattern.factoryPattern.bestPractice.factory.PhoneFactory;
import com.xumingwei.designPattern.factoryPattern.bestPractice.phone.PhoneInteface;
import org.junit.Test;

/**
 * 工厂模式测试
 */
public class FactoryPatternTest {

    /**
     * 测试手机工厂
     */
    @Test
    public void testPhone(){
        //准备一个手机工厂
        PhoneFactory factory = new PhoneFactory();

        //生产一部华为手机
        PhoneInteface huawei = factory.getPhone("Huawei");

        //显示华为手机的品牌
        huawei.printBrand();

        //再生产一部小米手机
        PhoneInteface xiaomi = factory.getPhone("Xiaomi");

        //显示小米手机品牌
        xiaomi.printBrand();

    }
}
