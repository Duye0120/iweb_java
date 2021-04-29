package Exception.lesson01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常的分类
 * 运行时异常和检查时异常
 * 1. 运行时异常: 程序在运行过程中产生异常,分类为RuntimeException和它的子类
 * 2. 检查异常: 程序本身没有问题,由于外部原因导致的异常.RuntimeException以外的异常
 */
public class Test {
    public static void main(String[] args) {
        System.out.println();
        // 运行时异常
        // String str = null
        // System.out.println(str.equals(" abc"));// 比较2个字符串的值

        // 检查异常: 文件读取
        try {
            // 可能发生异常的代码:发生异常的可能性就是文件不存在,文件时程序外部的内容,和程序本身无关.
            new FileInputStream("c:\\user\\Vinom\\word.txt");
        } catch (FileNotFoundException e) {
            // 异常发生时执行
            e.printStackTrace();// 打印异常最终的内容

        }
    }
}
