package com.iweb.lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-24 0024 14:02
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        // 调用接口中的常量
        System.out.println(Service.USERNAME);

        // 通过多态的方式
        Service service = new UserService();
        service.show();

        if (service instanceof Server) {
            ((Server) service).init();
        }
    }
}
