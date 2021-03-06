package com.duye.servlet;

import com.alibaba.fastjson.JSON;
import com.duye.Dao.UserDao;
import com.duye.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 1. 验证登录 http://localhost:8080/user/login post user=admin pwd = admin
 * 2. 查询用户信息 http://localhsot:8080/user/info get id在session中
 * 3. 修改密码 http://localhost:8080/user/pwd post pwd = 321 id在session中
 * 4. 修改地址 http://localhost:8080/user/addr post addr = newAddr id在session中
 */

@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String action = url.replaceAll("/user/", "");
        if ("login".equals(action)) login(req, resp);
        if ("info".equals(action)) info(req, resp);
        if ("pwd".equals(action)) pwd(req, resp);
        if ("addr".equals(action)) addr(req, resp);

    }

    private void addr(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        int id = Integer.parseInt(userId.toString());
        String addr = req.getParameter("addr");
        UserDao userDao = new UserDao();
        userDao.updateAddr(id, addr);
        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }

    private void pwd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取当前登录用户
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        int id = Integer.parseInt(userId.toString());
        String pwd = req.getParameter("pwd");
        UserDao userDao = new UserDao();
        userDao.updatePwd(id, pwd);
        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }

    private void info(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 获取当前登录用户
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        int id = Integer.parseInt(userId.toString());
        UserDao userDao = new UserDao();
        User user = userDao.selectById(id);
        PrintWriter writer = resp.getWriter();
        writer.println(JSON.toJSON(user));
        writer.flush();
        writer.close();
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pwd = req.getParameter("pwd");
        UserDao userDao = new UserDao();
        User name = userDao.selectByUserName(user);

        if (name == null) {
            req.setAttribute("msg", user + "不存在");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }
        if (!pwd.equals(name.getPassword())) {
            req.setAttribute("msg", "密码不正确");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        HttpSession session = req.getSession();
        session.setAttribute("userId", name.getId());
        req.getRequestDispatcher("/info.jsp").forward(req, resp);

    }
}
