package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:28
 * 描述: Emp : 员工类
 */
public abstract class Emp {

    private String name; // 姓名
    private String no; // 工号

    public Emp() {
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public Emp(String name, String no) {
        this.name = name;
        this.no = no;
    }

    /**
     * 上班打卡： 所有的员工都有同样的打卡方式
     */
    public void card() {
        System.out.println("emp is card");
    }

    // 抽象方法： 只有方法的声明、没有具体的实现
    public abstract void work();

}
