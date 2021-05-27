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
 * 时间: 2021-05-27 0027 14:27
 * 描述: UserServlet
 */
@WebServlet("/login") // 请求url : http://localhost:8080/login?name=admin
public class UserServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理过程就是打印
        String name = req.getParameter("name");
        System.out.println(name);
        // 渲染视图 : 读取 html 文件的内容并 通过流写回给用户
        /*PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>");
        writer.println("    <meta charset=\"UTF-8\">");
        writer.println("    <title>Title</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>main:" + name + "</h1>");
        writer.println("</body>");
        writer.println("</html>");
        writer.flush();
        writer.close();*/

        req.setAttribute("name", name); // 把信息保存到  HttpServletRequest 中
        req.getRequestDispatcher("/main.jsp").forward(req, resp);

    }
}
