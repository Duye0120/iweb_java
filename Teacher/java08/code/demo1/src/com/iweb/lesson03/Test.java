package com.iweb.lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 08:58
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        try {
            System.out.println(1 / 1);
            int[] arr = {10, 20, 30};
            System.out.println(arr[3]);

            System.out.println("后面的代码");
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage()); // 异常的信息
            System.out.println("算术");
            e.printStackTrace(); // 打印异常栈追踪的内容
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
