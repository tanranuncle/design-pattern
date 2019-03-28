package cn.mwxu.AdapterPattern.bestPractice.adapter;

import cn.mwxu.AdapterPattern.bestPractice.lightning.LightningEarPhoneInterface;
import cn.mwxu.AdapterPattern.bestPractice.threePointFive.ThreePointFiveEarPhoneInterface;

/**
 * 一个 lightning 转 3.5 毫米 的转换器
 */
public class EarPhoneAdapter implements LightningEarPhoneInterface {

    private ThreePointFiveEarPhoneInterface threePointFiveEarPhone;

    public void setThreePointFiveEarPhone(ThreePointFiveEarPhoneInterface threePointFiveEarPhone) {
        this.threePointFiveEarPhone = threePointFiveEarPhone;
    }

    public void play() {
        threePointFiveEarPhone.play();
    }
}
