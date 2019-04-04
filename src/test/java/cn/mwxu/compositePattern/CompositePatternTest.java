package cn.mwxu.compositePattern;

import cn.mwxu.compositePattern.bestPractice.Address;
import org.junit.Test;

/**
 * 测试组合模式
 */
public class CompositePatternTest {

    @Test
    public void testCompositePattern(){
        //准备一个地址起点
        Address address = new Address("地球");
        //准备下级地点
        Address china = new Address("中国");
        Address canada = new Address("加拿大");
        Address pakistan = new Address("巴基斯坦");
        address.addAddress(china);
        address.addAddress(canada);
        address.addAddress(pakistan);
        //为China准备下级地点
        Address zhejiang = new Address("浙江");
        Address taiwan = new Address("台湾");
        Address jiangshu = new Address("江苏");
        china.addAddress(zhejiang);
        china.addAddress(taiwan);
        china.addAddress(jiangshu);
        //为zhejiang准备下级地点
        Address hangzhou = new Address("杭州");
        Address wenzhou = new Address("温州");
        Address ningbo = new Address("宁波");
        zhejiang.addAddress(hangzhou);
        zhejiang.addAddress(wenzhou);
        zhejiang.addAddress(ningbo);

        address.printAll();
    }
}
