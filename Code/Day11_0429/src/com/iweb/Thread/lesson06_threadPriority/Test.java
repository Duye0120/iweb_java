package com.iweb.Thread.lesson06_threadPriority;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "A");
        Thread t2 = new Thread(myRunnable, "B");
        Thread t3 = new Thread(myRunnable, "C");
        // 线程默认的优先级5
        // 通知jvm希望这个线程优先执行,但是不一定有限
        int priority = t1.getPriority();
        System.out.println(priority);

        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
    }
}
