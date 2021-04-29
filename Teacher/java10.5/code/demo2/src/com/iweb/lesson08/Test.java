package com.iweb.lesson08;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 13:57
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "A");
        t.start();

        ThreadGroup tg = new ThreadGroup("线程组A");
        Thread t1 = new Thread(tg, mr, "B");

        t1.start();
    }
}
