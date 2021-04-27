package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 08:59
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Phone phone = new Phone("华为", 8);

        // 查看手机型号
        System.out.println(phone.getModel());
        System.out.println(phone.getMemory());
        // 通过手机进行拍照
        phone.camera();

        // 打开APP
        phone.openApp();
        // 查看剩余内存
        System.out.println(phone.getMemory());

    }

}
