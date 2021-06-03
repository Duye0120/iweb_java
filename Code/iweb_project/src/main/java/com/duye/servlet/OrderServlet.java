package com.duye.servlet;

import com.duye.bean.Order;
import com.duye.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/order/*")
public class OrderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取url 获取action
        String url = req.getRequestURI();
        String action = url.replace("/order/","");

        if ("add".equals(action)) addOrder(req,resp);
        if ("selectOrders".equals(action)) selectOrder(req,resp);
    }

    private void selectOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int oid = Integer.parseInt(req.getParameter("oid"));
        OrderDao orderDao = new OrderDao();
        Order order = orderDao.selectOrder();
        req.setAttribute("order",order);
        req.getRequestDispatcher("/order.jsp").forward(req,resp);

    }

    private void addOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int gid = Integer.parseInt(req.getParameter("gid"));
        int count = Integer.parseInt(req.getParameter("count"));

        HttpSession session = req.getSession();
        Object uid = session.getAttribute("uid");
        if (uid != null){
            // 完善数据
            Order order = new Order();
            order.setGid(gid);
            order.setCount(count);
            order.setUid(Integer.parseInt(uid.toString()));
            order.setStatus(0);
            OrderDao orderDao = new OrderDao();
            orderDao.save(order);
            req.getRequestDispatcher("/order.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
