package cn.mwxu.singletonPattern.otherCase;

/**
 * 单例模式实现之饿汉模式
 * 线程安全，类加载时实例化，若从未被使用则造成内存浪费
 */
public class StarvingModel {

    //静态常量
    private static final StarvingModel starvingModel = new StarvingModel();

    //私有化构造方法，防止外部创建实例
    private StarvingModel(){}

    //获取唯一实例
    public static StarvingModel getInstance(){
        return starvingModel;
    }
}
