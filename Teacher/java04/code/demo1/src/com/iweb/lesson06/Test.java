package com.iweb.lesson06;

/**
 * 作者: jack
 * 时间: 2021-04-19 0019 13:56
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {


        // 使用构造函数进行属性初始化

        // 以前的做法
//        Student student = new Student();
//        student.name = "jack";
//        student.age = 20;

        // 使用构造函数重载的做法 : 根据需要初始化的属性选择调用对应的构造函数重载

        Student s1 = new Student("jack");
        System.out.println(s1.name);

        Student s2 = new Student("jack", 20);
        System.out.println(s2.name + "\t" + s2.age);


    }

}
