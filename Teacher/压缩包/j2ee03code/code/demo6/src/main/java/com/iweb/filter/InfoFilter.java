package com.iweb.filter;

import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 15:34
 * 描述: InfoFilter
 */
@WebFilter({"/user/info"})
public class InfoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            chain.doFilter(request, response);
        } else {
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
