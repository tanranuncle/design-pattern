package cn.mwxu.abstractFactoryPattern.bestPractice.computer;

/**
 * 小米电脑
 */
public class XiaomiComputer implements ComputerInterface {

    @Override
    public void printBrandAndName() {
        System.out.println("Xiaomi computer : Xiaomi pro 15.6");
    }
}
