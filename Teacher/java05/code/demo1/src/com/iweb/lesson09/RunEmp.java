package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:39
 * 描述: RunEmp
 */
public class RunEmp extends Emp {

    public RunEmp(String name, String no) {
        super(name, no);
    }

    @Override
    public void work() {
        System.out.println("运维人员" + getName() + "奔跑吧");
    }
}
