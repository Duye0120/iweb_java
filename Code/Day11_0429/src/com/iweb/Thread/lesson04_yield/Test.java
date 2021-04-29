package com.iweb.Thread.lesson04_yield;

public class Test {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "A");
        Thread t2 = new Thread(mr, "B");
        t1.start();
        t2.start();
    }
}
