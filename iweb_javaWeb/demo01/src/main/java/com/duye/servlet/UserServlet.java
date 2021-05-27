package com.duye.servlet;

import com.duye.bean.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.解析url /user/login => login => 登录
        String url = req.getRequestURI();
        String action = url.replace("/user/", "");
        // 2. 根据请求动，调用目标业务方法
        if ("login".equals(action)) login(req, resp);
        if ("selectUsers".equals(action)) selectUsers(req, resp);
    }

    /**
     * 查询用户
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void selectUsers(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> users = Arrays.asList(
                new Users(1,"admin","123456"),
                new Users(2,"张三","123456"),
                new Users(3,"李四","123456"),
                new Users(4,"王五","123456")
        );
        req.setAttribute("users",users);
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }

    /**
     * 登录页面
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 规定 只有admin = admin才可以登录
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (!"admin".equals(username)) {
            // setAttribute（设置属性）
            req.setAttribute("message","用户不存在");
            // 转发 getRequestDispatcher（获取请求调度程序）
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        if (!"admin".equals(password)) {
            req.setAttribute("message","密码不正确");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

        // 调用查询用户
        selectUsers(req,resp);
    }

}
