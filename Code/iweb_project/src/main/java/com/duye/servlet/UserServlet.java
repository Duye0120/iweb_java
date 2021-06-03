package com.duye.servlet;

import com.duye.bean.User;
import com.duye.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 截取url 获取action
        String url = req.getRequestURI();
        String action = url.replace("/user/", "");
        if ("login".equals(action)) login(req, resp);
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");

        /*
        1. 根据用户名查询用户
        2. 如果用户为空则返回用户不存在
        3. 验证密码如果密码不正确则返回密码不正确
        4. 将用户保存到session中
        5. 返回 item.jsp
        */
        UserDao userDao = new UserDao();
        User user = userDao.selectUserByName(uname);
        if (user == null){
            req.setAttribute("message","用户不存在");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }

        if (!upwd.equals(user.getUpwd())){
            req.setAttribute("message","密码不正确");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }

        HttpSession session = req.getSession();
        session.setAttribute("uid",user.getUid());

//        req.getRequestDispatcher("/list.jsp").forward(req,resp);
        resp.sendRedirect("/good/selectGoods");
    }
}
