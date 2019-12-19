package com.xumingwei.designPattern.adapterPattern.bestPractice.adapter;

import com.xumingwei.designPattern.adapterPattern.bestPractice.lightning.LightningEarPhoneInterface;
import com.xumingwei.designPattern.adapterPattern.bestPractice.threePointFive.ThreePointFiveEarPhoneInterface;

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
