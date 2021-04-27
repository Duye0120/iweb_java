package com.iweb.lesson01;

import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 08:46
 * 描述: Test
 * <p>
 * 方法
 * [访问修饰符] 返回值类型 方法名([参数列表]){
 * // 方法体
 * return [返回值]
 * }
 * 访问修饰符： 现阶段我们都使用 public (不写-缺省的、private、protected)
 * 返回值类型： void-表示没有返回值、 任意的数据类型-基本数据类型、引用数据(String、数组、自定义的java类型)
 * 方法名： 方法名需要遵循变量的命名规则
 * 参数列表： 理论上不限制类型和个数。 约定上 不超过3个
 * 方法体：业务代码
 * 返回值： 和 返回值类型 相关(指定数据类型的字面量、变量、表达式), 如果是void 则不需要返回值。
 */
public class Test {

    public void show(int a, String str) {
        System.out.printf("(int %s, String %s) \n", a, str);
    }

    public double sum(double a, double b) {
        // return 10.0D; // 返回的是字面量
        double res = a + b;
        // return res; // 返回变量
        return a + b; // 表达式
    }

    // 多参数列表, 必须是形参的最后一个
    public int[] createArr(String str, int... num) {  // >=0     实参传递 ：  1,2,3,4
        return num; // num 在运行的过程中看作是一个数组
    }

    public int[] createArr1(int[] num) {  // 数组    实参: 要先创建一个数组  new int[len]
        return num;
    }

    public static void main(String[] args) {
        Test t = new Test(); // new 是开辟堆内存空间
        t.show(100, "iweb");

        double res = t.sum(10.0D, 20); // ????  // 20 int - > double
        System.out.println(res);

        int[] arr = t.createArr("arr", 1, 2, 3, 4);
        System.out.println(Arrays.toString(arr));
    }

}
