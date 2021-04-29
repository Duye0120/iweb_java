package com.iweb.lesson10;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 14:46
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "A");
        Thread t2 = new Thread(mr, "B");

        t1.start();
        t2.start();

        Thread.sleep(5000);

        synchronized ("lockA") {
            // System.out.println("唤醒其中一个线程");
            // "lockA".notify();
            System.out.println("唤醒所有线程");
            "lockA".notifyAll();
        }

    }
}
