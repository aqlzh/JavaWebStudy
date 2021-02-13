package cn.lzh.web.servlet;

import cn.lzh.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // 给页面一句话   设置编码
        response.setContentType("text/html;charset=utf-8");
        // 输出
        // 获取request 域 中共享对象
       User user  =(User) request.getAttribute("user") ;
       if( user != null){
           response.getWriter().write("登入成功，"+user.getUsername()+"欢迎你");
       }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
