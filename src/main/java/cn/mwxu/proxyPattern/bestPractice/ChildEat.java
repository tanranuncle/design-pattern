package cn.mwxu.proxyPattern.bestPractice;

/**
 * 小孩儿自己吃饭
 */
public class ChildEat implements  Eat {

    private String name;

    public ChildEat(String name){
        this.name = name;
    }

    @Override
    public void toEat() {
        System.out.println(name + "正在吃饭");
    }
}
