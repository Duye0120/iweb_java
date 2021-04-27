package com.iweb.lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 10:37
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {

        String str1 = "abc"; // 存储位置是栈空间
        String str2 = new String("abc"); // new 的方式, 存储位置是 堆空间
        String str3 = "abc";
        String str4 = new String("abc");

        System.out.println(str1 == str3); // abc和abc值进行比较  == true
        System.out.println(str2 == str4); // 栈保存的是内存地址, 比较的是内存地址  == false
        System.out.println(str1 == str2); // false  abc值和内存地址进行比较

        // 字符串的比较推荐是 equals()
        System.out.println(str1.equals(str2)); // true
    }
}
