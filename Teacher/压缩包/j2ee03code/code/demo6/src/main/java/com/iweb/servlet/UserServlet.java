package com.iweb.servlet;

import com.alibaba.fastjson.JSON;
import com.iweb.bean.User;
import com.iweb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 14:23
 * 描述: UserServlet
 * 1. 验证登录 ： http://localhost:8080/user/login   post  account=admin  pwd=123
 * 2. 查询用户信息: http://localhost:8080/user/info  get   id在session
 * 3. 修改密码 http://localhost:8080/user/pwd   post   pwd=321   id在session中
 * 4. 修改地址 htpp://localhost:8080/user/addr  post   addr=newaddr  id在session中
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
        // 获取当前登录用户
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        Integer id = Integer.parseInt(userId.toString());
        String addr = req.getParameter("addr");
        UserDao userDao = new UserDao();
        userDao.updateAddr(id, addr);
        req.getRequestDispatcher("/info.jsp").forward(req, resp);


//        if (userId != null) {
//            Integer id = Integer.parseInt(userId.toString());
//            String addr = req.getParameter("addr");
//            UserDao userDao = new UserDao();
//            userDao.updateAddr(id, addr);
//            req.getRequestDispatcher("/info.jsp").forward(req, resp);
//        } else {
//            resp.sendRedirect("/login.jsp"); // 没有数据传递到视图 所有使用重定向
//        }
    }

    private void pwd(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // 获取当前登录用户
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        Integer id = Integer.parseInt(userId.toString());
        String pwd = req.getParameter("pwd");
        UserDao userDao = new UserDao();
        userDao.updatePwd(id, pwd);
        req.getRequestDispatcher("/info.jsp").forward(req, resp);

//        if (userId != null) {
//            Integer id = Integer.parseInt(userId.toString());
//            String pwd = req.getParameter("pwd");
//            UserDao userDao = new UserDao();
//            userDao.updatePwd(id, pwd);
//            req.getRequestDispatcher("/info.jsp").forward(req, resp);
//        } else {
//            resp.sendRedirect("/login.jsp"); // 没有数据传递到视图 所有使用重定向
//        }
    }

    private void info(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        // 获取当前登录用户
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        Integer id = Integer.parseInt(userId.toString());
        UserDao userDao = new UserDao();
        User user = userDao.selectById(id);
        PrintWriter writer = resp.getWriter();
        writer.println(JSON.toJSON(user));
        writer.flush();
        writer.close();


//        if (userId != null) {
//            Integer id = Integer.parseInt(userId.toString());
//            UserDao userDao = new UserDao();
//            User user = userDao.selectById(id);
//            PrintWriter writer = resp.getWriter();
//            writer.println(JSON.toJSON(user));
//            writer.flush();
//            writer.close();
//        } else {
//            PrintWriter writer = resp.getWriter();
//            writer.println(JSON.toJSON(false));
//            writer.flush();
//            writer.close();
//        }

    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");

        UserDao userDao = new UserDao();
        User user = userDao.selectByAccount(account);

        if (user == null) {
            req.setAttribute("msg", account + "不存在");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        if (!pwd.equals(user.getPwd())) {
            req.setAttribute("msg", "密码不正确");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }

        HttpSession session = req.getSession();
        session.setAttribute("userId", user.getId());

        req.getRequestDispatcher("/info.jsp").forward(req, resp);
    }
}
