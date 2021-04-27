package com.iweb.lesson17;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 15:43
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Boy boy = new Boy("tom", 1100);
        Girl girl = new Girl("lucy", 90);

        MeiPo meiPo = new MeiPo();
        meiPo.piPei(boy, girl);

    }

}
