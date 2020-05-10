package com.xumingwei.designPattern.facadePattern;

import org.junit.Test;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 18:54
 */
public class FacadePatternTest {

    @Test
    public void test(){
        EatFacade facade = new EatFacade();

        facade.toHaveBreakFast();

        facade.tohaveLunch();

        facade.toHaveDinner();

        facade.toEatOnOneDay();
    }
}
