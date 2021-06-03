package com.iweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 15:33
 * 描述: ModifyFilter
 */
@WebFilter(value = {"/user/pwd", "/user/addr"})
public class ModifyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("ModifyFilter is doFilter");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            chain.doFilter(request, response); // 放心
        } else {
            resp.sendRedirect("/login.jsp"); // 没有数据传递到视图 所有使用重定向
        }
    }

    @Override
    public void destroy() {

    }
}
