package com.duye.filter;

import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter({"/user/info"})
public class InfoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            PrintWriter writer = resp.getWriter();
            writer.println(JSON.toJSON(false));
            writer.flush();
            writer.close();
        }
    }

    @Override
    public void destroy() {

    }
}
