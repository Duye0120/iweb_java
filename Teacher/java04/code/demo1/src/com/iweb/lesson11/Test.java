package com.iweb.lesson11;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 16:11
 * 描述: Test
 */
public class Test {

    public long divide(long a, long b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        return a / b;
    }

    public short divide(short a, short b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        return (short) (a / b); // 整型计算结果默认是 int
    }


    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return 0.0D;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Test test = new Test();
        // 对应调用者而言只是调用一个方法, 而有JVM去判断调用了哪个方法重载
        short a = 10;
        short b = 5;
        test.divide(a, b); // JVM会判定调用哪个方法重载

    }

}
