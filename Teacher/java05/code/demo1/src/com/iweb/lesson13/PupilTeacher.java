package com.iweb.lesson13;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 13:57
 * 描述: PupilTeacher
 */
public class PupilTeacher extends Teacher {
    @Override
    public void teach(Student student) {
        System.out.println("幼儿园老师教" + student.getName());
    }
}
