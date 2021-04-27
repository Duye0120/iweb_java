package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 09:18
 * 描述: Test1
 */
public class Test1 {

    public void change(int a) { //  a = a ; ->  a = 10;
        System.out.println("before:" + a);
        a = 20; // 改变a的值
        System.out.println("after:" + a);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        int a = 10;
        t1.change(a); // 传递的是字面量
        System.out.println(a); //  10

    }

}
