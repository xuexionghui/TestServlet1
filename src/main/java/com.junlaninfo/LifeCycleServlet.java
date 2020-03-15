package com.junlaninfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 辉 on 2020/3/15.
 */
public class LifeCycleServlet  extends HttpServlet {
    public LifeCycleServlet(){
        System.out.println("LifeCycleServlet 执行构造函数..");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("LifeCycleServlet初始化... init()");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LifeCycleServlet初始化... doGet()");
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("service执行");
//    }




    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet初始化... destroy()");
    }
}
