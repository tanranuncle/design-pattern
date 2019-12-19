package com.xumingwei.designPattern.proxyPattern.bestPractice;

/**
 * 成人代理吃饭
 */
public class AdultProxyEat implements Eat{

    private Eat eat;

    public AdultProxyEat(String name){
        eat = new ChildEat(name);
    }

    @Override
    public void toEat() {
        System.out.println("大人监督吃饭前：洗手。。。");
        eat.toEat();
        System.out.println("大人监督吃饭后：刷牙。。。");
    }
}
