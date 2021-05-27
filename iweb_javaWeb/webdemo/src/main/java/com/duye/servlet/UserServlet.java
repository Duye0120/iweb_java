package com.duye.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 业务方法
        System.out.println("service");
        // 获取用户请求的url
        String url = req.getRequestURI();
        System.out.println("url:" + url);

        // 获取用户请求的数据 http://localhost:8080/login
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 转发视图
        req.getRequestDispatcher("/main.html").forward(req,resp);
        System.out.println(username+ "" + password);
    }
}
