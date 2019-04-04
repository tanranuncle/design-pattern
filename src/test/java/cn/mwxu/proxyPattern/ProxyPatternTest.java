package cn.mwxu.proxyPattern;

import cn.mwxu.proxyPattern.bestPractice.AdultProxyEat;
import cn.mwxu.proxyPattern.bestPractice.ChildEat;
import cn.mwxu.proxyPattern.bestPractice.Eat;
import org.junit.Test;

/**
 * 测试代理模式
 */
public class ProxyPatternTest {

    @Test
    public void testProxyPattern(){
        //准备一个要吃饭的小孩儿
        Eat child = new ChildEat("Xiao Ming");
        //小孩自己吃饭
        child.toEat();
        //准备一个有成人帮助吃饭的小孩儿
        Eat adult = new AdultProxyEat("Xiao Ming");
        //大人帮忙吃饭
        adult.toEat();

    }
}
