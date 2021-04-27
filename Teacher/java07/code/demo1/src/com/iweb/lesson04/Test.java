package com.iweb.lesson04;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 10:49
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 加载类
        // Class.forName("com.iweb.lesson04.User"); // 没有创建对象 没有调用方法

        // 创建对象
        // new User(); // 1. 加载类(加载到方法区) 2. 创建对象(调用构造函数)
        // 执行顺序 1. 静态代码块 2. 代码块 3. 构造函数


        // 调用静态属性和静态方法: 直接通过类的名称来调用
        // System.out.println(User.USER_NAME);
        User.show();

    }
}
