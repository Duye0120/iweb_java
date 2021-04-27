package com.iweb.lesson01;

import java.lang.reflect.Field;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 08:52
 * 描述: Test
 * Object类： 始祖类, 所有类的父类。 如果一个类没有显示的继承另外一个类，缺省继承了Object类
 * <p>
 * native: 本地的意思, 调用本地方法区(C语言的一些源码)
 * JAVA->JVM->硬件(CPU内存)
 * <p>
 * registerNatives： 初始化java在执行过程中需要使用的一些API
 * <p>
 * getClass(): 回去当前类
 * <p>
 * public native int hashCode();获取对象的 hashCode值
 * <p>
 * hashCode：是一个int类型，同一个数据类型(基本数据类型、引用数据类型)的hashCode值不同,
 * 不同的类型的算法不同。
 * String存在字面量不同hashCode值相同
 * clone(): 克隆一个对象. 和原来的不是同一个对象
 * toString(): 内存地址, 对象输出的时候默认调用 toString
 *
 */
public class Test {

    public static void main(String[] args) {

        User user = new User("jack", 20);

        // 封装了类的一些成员和属性,Class 类的分类, 可以通过Class的对象获取类的 构造函数、属性、方法
        Class clazz = user.getClass();

        System.out.println(clazz.getSimpleName()); // 获取类的名称

        // Field 属性的分类
        Field[] fields = clazz.getDeclaredFields();// 获取类中的所有属性(包含私有的)

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        /*hashCode*/
        // byte b = 100;
        // System.out.println(b); // 基本数据类型不能使用方法, 可以根据他对应的包装类来获取
        Byte b = 100;
        System.out.println(b.hashCode());// 100

        Long l = 900L;
        System.out.println(l.hashCode());

        Float f = 100.1F;
        System.out.println(f.hashCode()); // 1120416563

        System.out.println("".hashCode()); // 0

        System.out.println("abc".hashCode()); // 97  96354  : 存在值不同而hashcode值相同


        System.out.println(user.toString()); // 对象类型输出的时候默认调用 toString
        System.out.println(user);

    }


}
