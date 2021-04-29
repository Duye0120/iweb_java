package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-29 0029 13:44
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "A");
        Thread t2 = new Thread(mr, "B");
        Thread t3 = new Thread(mr, "C");

        // 线程默认的优先级 ： 通知 JVM 希望这个线程优先执行, 但是不一定优先
        int priority = t1.getPriority();
        System.out.println(priority); // 5

        t1.setPriority(1); // 设定为最低优先级
        t2.setPriority(10);// 设定为最高优先级
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

    }
}
