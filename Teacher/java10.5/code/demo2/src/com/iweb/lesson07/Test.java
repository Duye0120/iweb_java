package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 13:51
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "守护线程");

        t.setDaemon(true);// 设定当前线程为守护线程

        t.start();

        Thread.sleep(3000);

        System.out.println("main over");

    }
}
