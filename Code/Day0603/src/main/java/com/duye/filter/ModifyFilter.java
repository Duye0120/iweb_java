package com.duye.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

// 如果同时过滤两个，需要使用value
@WebFilter(value = {"/user/pwd","/user/addr"})
public class ModifyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("ModifyFilter is doFilter");
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            resp.sendRedirect("/login.jsp");// 没有数据传递到视图，所以使用重定向
        }
    }

    @Override
    public void destroy() {

    }
}
