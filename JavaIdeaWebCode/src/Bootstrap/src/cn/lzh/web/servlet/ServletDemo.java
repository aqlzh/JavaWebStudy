package cn.lzh.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet("/demo4")    // 使用注解配置（servlet 3.0版本后）
public class ServletDemo implements Servlet {
    //初始化方法，在servlet 被创建时，只会执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    // 提供服务方法，每一次servlet 被访问时执行，执行多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servlet.....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }


    // 在服务器正常关闭时执行，执行一次
    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
