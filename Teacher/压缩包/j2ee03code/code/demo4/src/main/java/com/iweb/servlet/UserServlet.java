package com.iweb.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 13:34
 * 描述: UserServlet
 */
@WebServlet(value = "/hi", loadOnStartup = 1)
public class UserServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("UserServlet init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");
        String name = req.getParameter("name");
        System.out.println(name);
        req.setAttribute("name", name);
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

}
