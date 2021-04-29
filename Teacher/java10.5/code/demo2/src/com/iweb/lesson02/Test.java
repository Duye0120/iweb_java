package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 10:46
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        // 业务接口
        MyRunnable mr = new MyRunnable();

        // 启动多线程
        Thread t1 = new Thread(mr, "A");
        Thread t2 = new Thread(mr, "B");
        Thread t3 = new Thread(mr, "C");

        t1.start(); // 告诉 JVM 我们需要一个子线程, 由JVM向CPU去申请一个线程
        t2.start();
        t3.start();

        // 现在在执行后会自动销毁
        // t1.start(); // 抛出异常 IllegalThreadStateException
    }

}
