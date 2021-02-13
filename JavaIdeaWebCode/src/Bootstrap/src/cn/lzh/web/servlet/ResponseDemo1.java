package cn.lzh.web.servlet;
    // 重定向
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         super.doPost(req, resp);
         System.out.println("demo1...");
         //访问/responseDemo1，会自动跳转到/responseDemo2资源
       //1. 设置状态码为302

         resp.setStatus(302);
        //2.设置响应头location
        resp.setHeader("location","/Test/responseDemo2");
     }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
