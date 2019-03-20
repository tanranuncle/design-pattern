package cn.mwxu.singletonPattern;

import cn.mwxu.singletonPattern.bestPractice.DoubleCheck;
import cn.mwxu.singletonPattern.otherCase.StarvingModel;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试单例模式
 */
public class SingletonPatternTest {

    @Test
    public void testDoubleCheck(){
        Assert.assertNotNull(DoubleCheck.getInstance());
    }

    @Test
    public void testStarvingModel(){
        Assert.assertNotNull(StarvingModel.getInstance());
    }
}
