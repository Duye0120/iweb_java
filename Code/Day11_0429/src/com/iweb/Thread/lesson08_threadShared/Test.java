package com.iweb.Thread.lesson08_threadShared;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Good good = new Good();
        GoodRunnable gr = new GoodRunnable(good);
        Thread t1 = new Thread(gr);
        Thread t2 = new Thread(gr);
        Thread t3 = new Thread(gr);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(100);
        System.out.println(good.getCount());
    }
}
