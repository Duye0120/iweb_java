package com.iweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 14:08
 * 描述: AjaxServlet
 */
@WebServlet("/ajax")
public class AjaxServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 统一了编码
//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");

        System.out.println(req.getParameter("name"));

        PrintWriter writer = resp.getWriter();
        writer.println("小黑");
        writer.flush();
        writer.close();

    }
}
