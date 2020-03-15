package com.junlaninfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 辉 on 2020/3/15.
 */
public class ServetlDemo4 extends HttpServlet {
    private int i = 1;

    @Override
    public void init() throws ServletException {
        System.out.println("ServetlDemo4...init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置编码格式
        // resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");// 内容编码，防止出现中文乱码
        resp.setContentType("text/html;charset=utf-8");
        synchronized (ServetlDemo4.class) {
            // 向浏览器输出内容
            resp.getWriter().write("这是第" + i + "次访问...");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                // TODO: handle exception
            }

            i++;
        }

    }

    @Override
    public void destroy() {
        System.out.println("ServetlDemo4...destroy()");

    }
}
