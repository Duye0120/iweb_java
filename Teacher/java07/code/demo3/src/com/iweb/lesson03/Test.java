package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:31
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Handler handler1 = new Handler1();
        handler1.before();
        handler1.run();
        handler1.buy();

        handler1 = new Handler2();
        handler1.before();
        handler1.run();
        handler1.buy();
    }

}
