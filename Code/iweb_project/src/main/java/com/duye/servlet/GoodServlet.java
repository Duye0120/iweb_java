package com.duye.servlet;

import com.duye.bean.Good;
import com.duye.dao.GoodDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/good/*")
public class GoodServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 截取URL
        String url = req.getRequestURI();
        String action = url.replace("/good/", "");
        if ("selectGoods".equals(action)) selectGoods(req,resp);
        if ("selectGoodById".equals(action)) selectGoodById(req,resp);
    }

    private void selectGoodById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int gid = Integer.parseInt(req.getParameter("gid"));
        GoodDao goodDao = new GoodDao();
        Good good = goodDao.selectGoodById(gid);
        req.setAttribute("good",good);
        req.getRequestDispatcher("/item.jsp").forward(req,resp);
    }

    private void selectGoods(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GoodDao goodDao = new GoodDao();
        List<Good> list = goodDao.selectGoods();
        req.setAttribute("goods",list);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }


}
