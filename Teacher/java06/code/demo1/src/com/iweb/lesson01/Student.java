package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:14
 * 描述: Student
 */
public class Student {
    // ....
    private int stuNo; // 学号
    private String name;
    private int score;
    private String pwd;

    public void showInfo() {
        System.out.println(stuNo + "\t" + name + "\t" + score + "\t" + pwd);
    }

    public Student() {
    }

    public Student(int stuNo, String name, int score, String pwd) {
        this.stuNo = stuNo;
        this.name = name;
        this.score = score;
        this.pwd = pwd;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 比较学生先后方法
     *
     * @param s
     * @return s<this: < 0 s = this:0 s>this:>0
     */
    public int compare(Student s) {
        // return s.score - this.score;
        return this.score - s.score;
    }
}
