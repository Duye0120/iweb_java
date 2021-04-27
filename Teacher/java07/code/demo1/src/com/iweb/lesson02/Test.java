package com.iweb.lesson02;


/**
 * 作者: jack
 * 时间: 2021-04-24 0024 09:28
 * 描述: Test ： 垃圾回收
 * 如何判定一个对象是垃圾？
 * 什么时候触发GC？
 */
public class Test {


    /**
     * <p>
     * 垃圾回收：Java自动垃圾回收机制(GC:Garbage Collection), 对象不可达的时候回收
     * 1. 当内存到达一定的使用空间后会触发垃圾回收
     * 2. 对象不可达的时候回收
     * 3. 主动垃圾回收 System.gc(); 不一定会立即回收
     * <p>
     * finalize() 垃圾回收
     */
    @org.junit.Test
    public void finalizeTest() throws Exception {
        User user = new User();
        user = null;
        // System.gc(); // 提示垃圾回收
        String[] sts = new String[900000000]; // 空间不够
        Thread.sleep(1000); // 给一点时间 让 JVM 触发 GC
    }

    // 对象不可达
    public void createUser() {
        User user = new User();
    }

    @org.junit.Test
    public void finalizeTest1() throws Exception {
        createUser();
        System.gc();
        Thread.sleep(1000);
    }

    // 如何判定一个对象是垃圾。
    // 1. 引用计数法  : 问题是循环引用  a 是类B 的成员 , b是类A的成员, 导致回收
    // 2. 对象不可达 (java)

    /**
     * User  user = new User();
     * User user1 = user;
     * user = null;
     *
     *
     *
     *
     * public void show(){
     *     B b = new B();
     *     A a = new A();
     *     a.setB(b);
     *     b.setA(a);
     * }
     * 引用技术法：上面的场景不会回收  对象不可达算法会回收
     *
     *
     */


}
