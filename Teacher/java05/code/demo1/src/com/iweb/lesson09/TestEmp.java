package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:33
 * 描述: TestEmp
 */
public class TestEmp extends Emp {

    public TestEmp(String name, String no) {
        super(name, no);
    }

    @Override
    public void work() {
        // getName() 调用了父类的方法
        System.out.println("测试人员" + getName() + "测试代码");
    }
}
