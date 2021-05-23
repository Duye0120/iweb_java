package com.duye.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        1. 获取web.xml中配置的上下文参数context-param
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        System.out.println("username:" + username + " password: " + password);
//        2. 获取当前工程路径，格式：/工程路径
        System.out.println("当前工程工作路径" + context.getContextPath());
//        3. 获取共亨部署后在服务器硬盘上的绝对路径
        /**
         * D:\A_Java\iweb_java\environment\apache-tomcat-8.5.38\webapps\atguigu_war\
         * 映射到idea代码的web目录
         */
        System.out.println("工程部署的路径是：" + context.getRealPath("/"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
