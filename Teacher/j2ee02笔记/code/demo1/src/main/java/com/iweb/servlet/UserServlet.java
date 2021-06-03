package com.iweb.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-05-28 0028 08:48
 * 描述: UserServlet
 */
@WebServlet(value = "/hi", loadOnStartup = 1, initParams = {
        @WebInitParam(name = "username", value = "scott"),
        @WebInitParam(name = "password", value = "123456")
}) // http://localhost:8080/hi
public class UserServlet extends HttpServlet {


    /**
     * 用户第一次请求的时候执行,只会执行一次, 优先于 init()
     * 通过设置 loadOnStartup = 1 来使得服务器启动的时候 执行 init()
     *
     * @param config : ServletConfig 的 实例在服务器启动的时候获取用户配置的参数 @WebInitParam
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init(ServletConfig config)");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        System.out.println(username + "\t" + password);
    }

    /**
     * 初始化：
     * 用户第一次请求的时候执行,只会执行一次
     * 通过设置 loadOnStartup = 1 来使得服务器启动的时候 执行 init()
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("init ...");
    }

    /**
     * 用户发起 GET 请求的时候执行, 用来处理 GET 请求
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do Get ...");
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    /**
     * 用来处理 POST 请求
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do Post ...");
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    /**
     * 停止 服务器的时候销毁
     */
    @Override
    public void destroy() {
        System.out.println("destroy ...");
    }
}


