package com.duye.servlet;

import com.duye.bean.DataGrid;
import com.duye.bean.Page;
import com.duye.bean.User;
import com.duye.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接受用户的请求数据：封装page对象
        int current = Integer.parseInt(req.getParameter("page"));
        int count = Integer.parseInt(req.getParameter("count"));
        Page page = new Page(current, count);
        UserDao userDao = new UserDao();
        List<User> list = userDao.selectByPage(page);

        Integer total = userDao.selectCount();
        Integer pages = total % count == 0 ? total / count : (total / count) + 1;

        DataGrid<User> dataGrid = new DataGrid<>();
        dataGrid.setTotal(total);
        dataGrid.setList(list);
        req.setAttribute("dataGrid",dataGrid);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
