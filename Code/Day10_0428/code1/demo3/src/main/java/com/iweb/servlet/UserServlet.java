package com.iweb.servlet;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 10:47
 * 描述: UserServlet
 */
@WebServlet("/ajax")
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("id"));


        Map<String, String> user = new HashMap<>();
        user.put("id", "1");
        user.put("name", "jack");
        user.put("age", "20");

        PrintWriter writer = resp.getWriter();
        writer.println(JSON.toJSONString(user));
        writer.flush();
        writer.close();

    }
}
