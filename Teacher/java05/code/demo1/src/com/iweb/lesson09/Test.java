package com.iweb.lesson09;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 11:33
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {
        // 开发人员的日常工作
        CodeEmp codeEmp = new CodeEmp("张三", "007");
        codeEmp.work();

        TestEmp testEmp = new TestEmp("李四", "008");
        testEmp.work();

        // 运维人员
        RunEmp runEmp = new RunEmp("王五", "009");
        runEmp.work();
    }
}
