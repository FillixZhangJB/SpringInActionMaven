package webMVC.config;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zjb on 2019/6/10.
 */
public class MyDefaultFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("qqq");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("mapping到DispatcherServlet的filter执行前---------");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("mapping到DispatcherServlet的filter执行后---------");
    }

    public void destroy() {

    }
}
