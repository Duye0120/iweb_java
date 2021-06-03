package com.iweb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-05-28 0028 09:57
 * 描述: HelloServlet
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service");

        /*HttpServletRequest start*/
        System.out.println(req.getHeader("Accept"));
        req.setAttribute("name", "jack"); // 向request中保存数据
        /*HttpServletRequest end*/

        /*HttpSession start*/
        HttpSession session = req.getSession();
        session.setAttribute("ses-name", "ses-admin"); // 向session 中保存数据


        /*application*/
        // private final ServletContext facade = new ApplicationContextFacade(this);
        ServletContext application1 = req.getServletContext();
        ServletContext application2 = getServletContext();
        System.out.println(application1 == application2);
        System.out.println(application1);
        System.out.println(application2);
        application1.setAttribute("app-name", "app-jack");
        req.getRequestDispatcher("/main1.jsp").forward(req, resp);

    }
}
