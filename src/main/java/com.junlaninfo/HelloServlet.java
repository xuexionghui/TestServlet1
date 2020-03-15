package com.junlaninfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 辉 on 2020/3/15.
 */
public class HelloServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决中文乱码问题
        resp.setCharacterEncoding("utf-8");// 内容编码，防止出现中文乱码
        resp.setContentType("text/html;charset=utf-8");		//向浏览器输出内容
        resp.getWriter().write("这是第一个servlet程序。当前时间为："+new Date());
        //super.doGet(req, resp);
    }
}
