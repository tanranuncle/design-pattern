package cn.mwxu.abstractFactoryPattern.bestPractice;

import cn.mwxu.abstractFactoryPattern.bestPractice.factory.AbstractFactory;
import cn.mwxu.abstractFactoryPattern.bestPractice.factory.HuaweiFactory;
import cn.mwxu.abstractFactoryPattern.bestPractice.factory.XiaomiFactory;

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
