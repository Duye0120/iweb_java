package com.duye.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 服务器告诉你，你来的时间，把时间封装成一个信件，

        // 解决中文乱码
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        PrintWriter writer = resp.getWriter();
        // Cookie，服务器段从客户端获取
        Cookie[] cookies = req.getCookies();// 这里返回数组，说明cookie可能存在多个

        // 判断Cookie是否存在
        if (cookies != null) {
            // 如果存在怎么办
            writer.write("上一次访问的时间");
            for (Cookie cookie:cookies) {
                // 获取cookie的名字
                if (cookie.getName().equals("name")){

                }

            }
        }else{
            writer.println("第一次访问本站");
        }

        // 服务器给客户端响应一个cookie
        Cookie cookie = new Cookie("name", "duye");
        resp.addCookie(cookie);
    }
}
