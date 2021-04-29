package com.iweb.Thread.lesson07_threadProtected;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "守护线程");
        t.setDaemon(true); // 设定当前线程为守护线程

        t.start();
        Thread.sleep(3000);
        System.out.println("main over");

    }
}
