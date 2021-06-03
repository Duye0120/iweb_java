package com.iweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * 作者: jack
 * 时间: 2021-06-03 0003 13:43
 * 描述: UserFilter
 */
@WebFilter(value = "/hi", initParams = {
        @WebInitParam(name = "user", value = "scoot"),
        @WebInitParam(name = "pwd", value = "123456")
})  // 过滤的请求url   如果说要过滤所有  /*
public class UserFilter implements Filter {

    /**
     * 服务器 启动的时候执行 只会执行一次, 在servlet之前
     *
     * @param filterConfig : 可以获取初始化的时候设置的参数
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter init");
        // 获取参数
        String user = filterConfig.getInitParameter("user");
        String pwd = filterConfig.getInitParameter("pwd");
        System.out.println(user + "\t" + pwd);
    }

    /**
     * 每次请求的时候调用, 在servlet之前
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter");

        // 放行: 是否放行决定于上面的业务代码
        chain.doFilter(request, response);
    }

    /**
     * 服务器关闭的时候, 在servlet 之后
     */
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
