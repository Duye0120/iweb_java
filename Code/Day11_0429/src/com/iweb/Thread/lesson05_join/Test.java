package com.iweb.Thread.lesson05_join;

public class Test {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable();
        MyRunnable2 m2 = new MyRunnable2();
        Thread t1 = new Thread(m1, "A");
        Thread t2 = new Thread(m2, "B");
        m1.setThread(t2);
        t1.start();
    }
}
