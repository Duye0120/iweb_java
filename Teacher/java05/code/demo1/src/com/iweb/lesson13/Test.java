package com.iweb.lesson13;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 13:44
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        Teacher teacher = new PupilTeacher();

        Student student = new PupilStudent();

        teacher.teach(student);

    }

}
