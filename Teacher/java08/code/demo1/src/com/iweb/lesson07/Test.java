package com.iweb.lesson07;

/**
 * 作者: jack
 * 时间: 2021-04-26 0026 09:30
 * 描述: Test
 */
public class Test {
    public boolean login(String username, String password) {

        if (!username.equals("admin")) {
            throw new UserNameException("用户不存在");
        }

        if (!password.equals("admin")) {
            throw new PasswordException("密码错误");
        }

        return true;
    }

    public static void main(String[] args) {

        Test test = new Test();
        boolean res = test.login("user", "user");
        System.out.println(res);

    }

}
