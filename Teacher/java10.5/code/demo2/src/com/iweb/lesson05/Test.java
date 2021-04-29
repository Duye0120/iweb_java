package com.iweb.lesson05;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 11:13
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        MyRunnable1 m1 = new MyRunnable1();
        MyRunnable2 m2 = new MyRunnable2();

        Thread t1 = new Thread(m1, "A");
        Thread t2 = new Thread(m2, "B");

        m1.setThread(t2);

        t1.start();

    }

}
