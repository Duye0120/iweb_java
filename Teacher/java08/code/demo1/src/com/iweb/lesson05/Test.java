package com.iweb.lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 09:15
 * 描述: Test
 * throw : 异常抛出, 当前方法处理异常, 在方法上面声明可能发生的异常, 由调用者来处理
 */
public class Test {

    // 将异常抛出, 由调用者来处理异常
    public void readFile() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("E:\\1.txt");
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
