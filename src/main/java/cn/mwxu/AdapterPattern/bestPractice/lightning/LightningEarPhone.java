package cn.mwxu.AdapterPattern.bestPractice.lightning;

/**
 * 一款lightning接口的耳机
 */
public class LightningEarPhone implements LightningEarPhoneInterface {

    public void play() {
        System.out.println("使用Lightning接口的耳机播放音乐");
    }
}
