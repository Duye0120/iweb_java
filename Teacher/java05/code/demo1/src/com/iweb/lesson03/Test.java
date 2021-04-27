package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 09:10
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        System.out.println(p1.getModel() + "\t" + p1.getMemory());

        Phone p2 = new Phone(8);
        System.out.println(p2.getModel() + "\t" + p2.getMemory());

        Phone p3 = new Phone("P30", 8);
        System.out.println(p3.getModel() + "\t" + p3.getMemory());


        Phone p4 = new Phone();
        p4.setModel("P40");
        p4.setMemory(8);
        System.out.println(p4.getModel() + "\t" + p4.getMemory());

    }
}
