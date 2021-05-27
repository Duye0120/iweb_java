package com.iweb.servlet;

import com.iweb.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * 作者: jack
 * 时间: 2021-05-27 0027 15:33
 * 描述: UserServlet：
 * 处理的请求：
 * 1. 登录： http://locahost:8080/user/login  POST username=admin  password=admin
 * 2. 查询用户信息: http://localhost:8080/user/selectUsers  GET
 * ...
 */
@WebServlet("/user/*")
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 解析url  /user/login => login => 登录
        String url = req.getRequestURI();
        String action = url.replace("/user/", "");
        // 2. 根据请求动作 调用目标业务方法
        if ("login".equals(action)) login(req, resp);
        if ("selectUsers".equals(action)) selectUsers(req, resp);
    }

    /**
     * 查询用户
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void selectUsers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 模拟数据
        List<User> users = Arrays.asList(
                new User(1, "admin", "123456"),
                new User(2, "tom", "123456"),
                new User(3, "jack", "123456"),
                new User(4, "scott", "123456"),
                new User(4, "小黑", "123456")
        );
        req.setAttribute("users", users); // 返回查询数据
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 规定只有 admin=admin 才可以访问
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 根据用户名 查询用户   if(user ==null) 不存在

        if (!"admin".equals(username)) {
            req.setAttribute("message", "用户不存在"); // 返回信息给用户
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        // if(!user.getPassword().equals(password))  密码不正确
        if (!"admin".equals(password)) {
            req.setAttribute("message", "密码不正确"); // 返回信息给用户
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        // req.getRequestDispatcher("/main.jsp").forward(req, resp);

        // 调用查询用户
        selectUsers(req, resp);
    }
}
