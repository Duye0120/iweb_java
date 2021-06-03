package com.iweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-05-28 0028 09:34
 * 描述: HiServlet
 */
@WebServlet("/hi")
public class HiServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "hi jack");
        resp.sendRedirect("/hi.jsp");
    }
}
