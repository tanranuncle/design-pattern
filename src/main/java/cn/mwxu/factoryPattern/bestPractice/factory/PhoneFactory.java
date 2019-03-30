package cn.mwxu.factoryPattern.bestPractice.factory;

import cn.mwxu.factoryPattern.bestPractice.phone.HuaweiPhone;
import cn.mwxu.factoryPattern.bestPractice.phone.PhoneInteface;
import cn.mwxu.factoryPattern.bestPractice.phone.XiaomiPhone;

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
