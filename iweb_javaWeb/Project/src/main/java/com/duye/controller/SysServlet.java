package com.duye.controller;

import com.duye.utils.URLUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 系统管理
 */
@WebServlet("/sys/*")
public class SysServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = URLUtil.parseUrl(req.getContextPath(),"/sys/");
    }
}
