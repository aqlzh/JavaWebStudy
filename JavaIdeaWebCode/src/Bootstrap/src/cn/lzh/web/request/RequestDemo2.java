package cn.lzh.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 获取请求头信息
        //获取所有请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
        // 遍历
        while(headerNames.hasMoreElements()){
            String name =headerNames.nextElement() ;
            String value = request.getHeader(name);
            System.out.println(name+"-----"+value);

        }
    }
}
