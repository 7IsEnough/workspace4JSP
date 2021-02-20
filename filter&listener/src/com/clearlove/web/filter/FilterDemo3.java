package com.clearlove.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author promise
 * @date 2020/9/9 - 20:22
 */
//@WebFilter("/*")
public class FilterDemo3 implements Filter {
    /***
     * 在服务器关闭后，Filter对象被销毁。如果服务器是正常关闭，则会执行destroy方法，只执行一次（释放资源）
     */
    public void destroy() {

        System.out.println("destroy....");
    }


    /***
     * 每一次请求被拦截资源时，会执行。执行多次
     * @param req
     * @param resp
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter....");
        chain.doFilter(req, resp);
    }

    /***
     * 在服务器启动后，会创建Filter对象，然后调用init方法。只执行一次（加载资源）
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init...");
    }

}
