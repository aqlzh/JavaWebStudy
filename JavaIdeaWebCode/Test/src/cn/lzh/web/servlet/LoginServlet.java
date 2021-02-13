package cn.lzh.web.servlet;

import cn.lzh.dao.userdao;
import cn.lzh.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/loginServlet")  //没有 ;
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        // 1.设置编码
        req.setCharacterEncoding("utf-8");
        // 2.设置请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password") ;
        // 3.封装user对象
        User loginuser = new User();
        loginuser.setUsername(username);
        loginuser.setPassword(password);

        //4. 调用userdao  的login 方法
        userdao dao = new userdao();
        User user = dao.login(loginuser);

        // 5.判断 user
        if(user ==null){
            // 登入失败
            req.getRequestDispatcher("/failServlet").forward(req,resp);
        }else{
            // 登入成功，存储数据
            req.setAttribute("user",user);
            // 转发
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
           this.doGet(req, resp);
    }
}
