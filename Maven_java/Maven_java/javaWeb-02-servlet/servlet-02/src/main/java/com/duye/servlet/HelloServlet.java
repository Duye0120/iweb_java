package com.duye.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameter() 初始化参数
        //this.getServletConfig();servlet配置
        //this.getServletContext(); Servlet上下文
        ServletContext context = this.getServletContext();
        String UserName = "杜也";// 数据
        context.setAttribute("UserName",UserName);// 将一个数据保存在ServletContext中，名字为：username,值username
        System.out.println("hello");
    }
}
