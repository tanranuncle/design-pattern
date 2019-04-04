package cn.mwxu.strategyPattern.bestPractice;

/**
 * Xiaomi手机生产线
 */
public class XiaomiStrategy implements Strategy {

    public void printBrand() {
        System.out.println("正在生产Xiaomi手机");
    }
}
