package com.xumingwei.designPattern.facadePattern;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—10 18:51
 */
public class EatFacade {

    private Eat breakFast;
    private Eat lunch;
    private Eat dinner;

    public EatFacade() {
        this.breakFast = new BreakFast();
        this.lunch = new Lunch();
        this.dinner = new Dinner();
    }

    public void toHaveBreakFast(){
        breakFast.eat();
    }

    public void tohaveLunch(){
        lunch.eat();
    }

    public void toHaveDinner(){
        dinner.eat();
    }

    public void toEatOnOneDay(){
        breakFast.eat();
        lunch.eat();
        dinner.eat();
    }
}
