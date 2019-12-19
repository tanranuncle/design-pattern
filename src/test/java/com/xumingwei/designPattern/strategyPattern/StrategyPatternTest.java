package com.xumingwei.designPattern.strategyPattern;

import com.xumingwei.designPattern.strategyPattern.bestPractice.FoxconnProducer;
import com.xumingwei.designPattern.strategyPattern.bestPractice.HuaweiStrategy;
import com.xumingwei.designPattern.strategyPattern.bestPractice.Strategy;
import com.xumingwei.designPattern.strategyPattern.bestPractice.XiaomiStrategy;
import org.junit.Test;

/**
 * 测试策略模式
 * 同一个生产车间，给他提供不同的生产线，它就可以生产不同的产品
 */
public class StrategyPatternTest {

    @Test
    public void testStrategyPattern(){
        //准备一个富士康生产车间
        FoxconnProducer producer = new FoxconnProducer();
        //准备一条Huawei生产线
        Strategy strategy = new HuaweiStrategy();
        //将Huawei生产线放到该车间
        producer.setStrategy(strategy);
        //开始生产
        producer.toProduce();
        //再准备一条Xiaomi生产线
        strategy = new XiaomiStrategy();
        //将小米生产线放到该车间
        producer.setStrategy(strategy);
        //开始生产
        producer.toProduce();
    }
}
