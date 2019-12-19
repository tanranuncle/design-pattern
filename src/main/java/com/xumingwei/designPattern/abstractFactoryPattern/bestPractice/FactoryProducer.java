package com.xumingwei.designPattern.abstractFactoryPattern.bestPractice;

import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory.AbstractFactory;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory.HuaweiFactory;
import com.xumingwei.designPattern.abstractFactoryPattern.bestPractice.factory.XiaomiFactory;

/**
 * 工厂生成器
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String brand){
        if("Huawei".equals(brand)){
            return new HuaweiFactory();
        }else if("Xiaomi".equals(brand)){
            return new XiaomiFactory();
        }
        return null;
    }
}
