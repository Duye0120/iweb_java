package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 11:30
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        // String的性能
        String str = "a";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); // 5041

        // StringBuilder
        StringBuilder sb = new StringBuilder("a");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start); // 1

        System.out.println(str.equals(sb.toString())); // 不能写 sb 要是 sb.toString()
    }
}
