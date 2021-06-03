package com.iweb.servlet;

import com.alibaba.fastjson.JSON;
import com.iweb.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 09:12
 * 描述: UserServlet
 */
@WebServlet("/info")
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        System.out.println(name + "\t" + pwd);

        // 返回字符串： dataType: "text"
//        PrintWriter writer = resp.getWriter();
//        writer.println("hello box");
//        writer.flush();
//        writer.close();


        // 返回xml ： dataType: "xml"
//        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
//                "<beans>\n" +
//                "    <bean>\n" +
//                "        <property name=\"name\" value=\"admin\"/>\n" +
//                "        <property name=\"pwd\" value=\"123456\"/>\n" +
//                "    </bean>\n" +
//                "    <bean>\n" +
//                "        <property name=\"name\" value=\"jack\"/>\n" +
//                "        <property name=\"pwd\" value=\"123456\"/>\n" +
//                "    </bean>\n" +
//                "</beans>";
//        PrintWriter writer = resp.getWriter();
//        writer.println(xml);
//        writer.flush();
//        writer.close();

        // 返回json  用的最多的一种

        List<User> users = Arrays.asList(
                new User(1, "jack", 20),
                new User(2, "tom", 30));

        // 将users 转成json
        String json = JSON.toJSONString(users);
        System.out.println(json);

        PrintWriter writer = resp.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }
}
