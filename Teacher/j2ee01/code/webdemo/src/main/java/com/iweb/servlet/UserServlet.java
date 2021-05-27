package com.iweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-05-27 0027 09:28
 * 描述: UserServlet
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 业务方法
        System.out.println("service");
        // 获取用户请求的 url
        String url = req.getRequestURI();
        System.out.println("url:" + url);

        // 获取用户请求的数据 : http://localhost:8080/login?username=jack&password=111
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + "\t" + password);


        // 转发视图
        req.getRequestDispatcher("/main.html").forward(req, resp);
    }
}
