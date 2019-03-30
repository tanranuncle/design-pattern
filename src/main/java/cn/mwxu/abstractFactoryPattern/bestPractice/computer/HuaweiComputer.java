package cn.mwxu.abstractFactoryPattern.bestPractice.computer;

/**
 * 华为电脑
 */
public class HuaweiComputer implements ComputerInterface {

    @Override
    public void printBrandAndName() {
        System.out.println("Huawei computer : Huawei MateBook 13");
    }
}
