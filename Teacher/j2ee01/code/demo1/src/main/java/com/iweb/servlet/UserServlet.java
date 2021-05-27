package com.iweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-05-27 0027 13:46
 * 描述: UserServlet
 */
@WebServlet(urlPatterns = "/login") // http://127.0.0.1:8080/login
public class UserServlet extends HttpServlet {

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // TO DO
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//
//        // 链接数据库 使用 JDBC 进行用户认证：模拟
//        if (!"admin".equals(username)) {
//            System.out.println("用户不存在");
//            // 返回登录页面让用户重新输入
//            req.getRequestDispatcher("/index.html").forward(req, resp);
//            return;
//        }
//        if (!"admin".equals(password)) {
//            System.out.println("密码不正确");
//            req.getRequestDispatcher("/index.html").forward(req, resp);
//            return;
//        }
//
//        req.getRequestDispatcher("/main.html").forward(req, resp);
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet...");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 链接数据库 使用 JDBC 进行用户认证：模拟
        if (!"admin".equals(username)) {
            System.out.println("用户不存在");
            // 返回登录页面让用户重新输入
            req.getRequestDispatcher("/index.html").forward(req, resp);
            return;
        }
        if (!"admin".equals(password)) {
            System.out.println("密码不正确");
            req.getRequestDispatcher("/index.html").forward(req, resp);
            return;
        }

        req.getRequestDispatcher("/main.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost...");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 链接数据库 使用 JDBC 进行用户认证：模拟
        if (!"admin".equals(username)) {
            System.out.println("用户不存在");
            // 返回登录页面让用户重新输入
            req.getRequestDispatcher("/index.html").forward(req, resp);
            return;
        }
        if (!"admin".equals(password)) {
            System.out.println("密码不正确");
            req.getRequestDispatcher("/index.html").forward(req, resp);
            return;
        }

        req.getRequestDispatcher("/main.html").forward(req, resp);
    }
}
