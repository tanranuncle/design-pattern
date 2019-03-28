package cn.mwxu.adapterPattern.bestPractice;

import cn.mwxu.adapterPattern.bestPractice.lightning.LightningEarPhoneInterface;

/**
 * 一部 lightning 接口的 iPhone8 Plus 手机
 */
public class iPhone8Plus {

    private LightningEarPhoneInterface lightningEarPhone;

    public iPhone8Plus(){};

    public iPhone8Plus(LightningEarPhoneInterface lightningEarPhone) {
        this.lightningEarPhone = lightningEarPhone;
    }

    public void setLightningEarPhone(LightningEarPhoneInterface lightningEarPhone) {
        this.lightningEarPhone = lightningEarPhone;
    }

    public void playMusic(){
        lightningEarPhone.play();
    }
}
