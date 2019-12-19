package com.xumingwei.designPattern.factoryPattern.bestPractice.factory;

import com.xumingwei.designPattern.factoryPattern.bestPractice.phone.HuaweiPhone;
import com.xumingwei.designPattern.factoryPattern.bestPractice.phone.PhoneInteface;
import com.xumingwei.designPattern.factoryPattern.bestPractice.phone.XiaomiPhone;

/**
 * 手机工厂
 */
public class PhoneFactory {

    /**
     * 生产指定品牌的手机
     * @param brand
     * @return
     */
    public PhoneInteface getPhone(String brand) {
        if("Huawei".equals(brand)){
            return new HuaweiPhone();
        }else if("Xiaomi".equals(brand)){
            return new XiaomiPhone();
        }
        return null;
    }
}
