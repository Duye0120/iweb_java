package com.iweb.Thread.lesson02;

public class Test {
    public static void main(String[] args) {
        // 1. 创建线程
        MyRunnable myRunnable = new MyRunnable();
        // 2. 启动多线程
        Thread t1 = new Thread(myRunnable,"A");
        Thread t2 = new Thread(myRunnable,"B");
        Thread t3 = new Thread(myRunnable,"C");

        t1.start();
        t2.start();
        t3.start();
    }
}
