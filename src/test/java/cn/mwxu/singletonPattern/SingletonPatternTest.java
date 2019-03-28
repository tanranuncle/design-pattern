package cn.mwxu.singletonPattern;

import cn.mwxu.singletonPattern.bestPractice.DoubleCheck;
import cn.mwxu.singletonPattern.otherCase.StarvingModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试单例模式
 */
public class SingletonPatternTest {

    /**
     * 测试双重检查+锁
     */
    @Test
    public void testDoubleCheck(){
        Assert.assertNotNull(DoubleCheck.getInstance());
    }

    /**
     * 测试饿汉模式
     */
    @Test
    public void testStarvingModel(){
        Assert.assertNotNull(StarvingModel.getInstance());
    }
}
