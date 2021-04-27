package com.iweb.lesson17;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 15:43
 * 描述: MeiPo
 */
public class MeiPo {

    public void piPei(Boy boy, Girl girl) {
        System.out.println("开始匹配...");

        if (girl.getFaceValue() > 100) {
            System.out.println(boy.getName() + ",say:颜值达标");
            boy.getGirl(girl);
        } else {
            System.out.println(boy.getName() + ",say:颜值不够,不考虑");
        }
        if (boy.getWealth() > 1000) {
            System.out.println(girl.getName() + ",say:财富达标");
            girl.marryTo(boy);
        } else {
            System.out.println(girl.getName() + ",say:没钱不考虑");
        }

    }

}
