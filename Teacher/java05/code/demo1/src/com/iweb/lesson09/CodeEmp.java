package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:31
 * 描述: CodeEmp 开发人员
 */
public class CodeEmp extends Emp {


    public CodeEmp(String name, String no) {
        super(name, no); // 调用了父类的构造函数
    }

    // 重写了 父类的 work()
    @Override
    public void work() {
        // getName() 调用了父类的方法
        System.out.println("开发人员" + getName() + "写代码");
    }
}
