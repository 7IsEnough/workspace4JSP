package com.clearlove.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author promise
 * @date 2020/9/9 - 20:16
 */
//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求消息增强
        System.out.println("filterDemo2执行了...");

        //放行
        chain.doFilter(req, resp);
        //对response的响应消息增强
        System.out.println("filterDemo2回来了。。");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
