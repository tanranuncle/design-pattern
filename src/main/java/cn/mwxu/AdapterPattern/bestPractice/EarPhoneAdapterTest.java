package cn.mwxu.AdapterPattern.bestPractice;

import cn.mwxu.AdapterPattern.bestPractice.adapter.EarPhoneAdapter;
import cn.mwxu.AdapterPattern.bestPractice.threePointFive.ThreePointFiveEarPhone;
import cn.mwxu.AdapterPattern.bestPractice.threePointFive.ThreePointFiveEarPhoneInterface;

/**
 * lightning 转 3.5 毫米 接口转换器测试
 */
public class EarPhoneAdapterTest {

    public static void main(String[] args) {

        //准备一部lightning接口的iPhone8 Plus手机
        iPhone8Plus iPhone8Plus = new iPhone8Plus();

        //准备一个3.5毫米接口的耳机
        ThreePointFiveEarPhoneInterface threePointFiveEarPhone = new ThreePointFiveEarPhone();

        //准备一个lightning 转 3.5 毫米 的接口转换器
        EarPhoneAdapter earPhoneAdapter = new EarPhoneAdapter();

        //将3.5毫米接口的耳机插到转换器上
        earPhoneAdapter.setThreePointFiveEarPhone(threePointFiveEarPhone);

        //将转换器插到iPhone手机上
        iPhone8Plus.setLightningEarPhone(earPhoneAdapter);

        //打开iPhone手机上的酷狗音乐，播放歌曲
        iPhone8Plus.playMusic();
    }

}
