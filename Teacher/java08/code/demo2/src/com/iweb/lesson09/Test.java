package com.iweb.lesson09;

import java.util.Random;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:48
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(random.nextInt()); // 随机的整型数据
        System.out.println(random.nextInt(10)); // 0-9
        System.out.println(random.nextDouble()); // 0-1
    }

}
