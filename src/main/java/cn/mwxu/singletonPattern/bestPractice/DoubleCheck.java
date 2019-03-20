package cn.mwxu.singletonPattern.bestPractice;

/**
 * 单例模式实现之双重检查
 * 线程安全，被调用时才创建实例
 */
public class DoubleCheck {

    //保证变量的可见性、有序性
    private static volatile DoubleCheck doubleCheck;

    //私有化构造方法，防止外部创建实例
    private DoubleCheck() {}

    //双重检查+同步，兼顾线程安全和内存利用
    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
