package cn.mwxu.adapterPattern.bestPractice.adapter;

import cn.mwxu.adapterPattern.bestPractice.lightning.LightningEarPhoneInterface;
import cn.mwxu.adapterPattern.bestPractice.threePointFive.ThreePointFiveEarPhoneInterface;

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
