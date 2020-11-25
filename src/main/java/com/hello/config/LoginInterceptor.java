package com.hello.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (request.getRequestURI().contains("goLogin")) {
            System.out.println("登录页面放行");
            return true;
        }
        if (request.getRequestURI().contains("login")) {
            System.out.println("正在提交登录放行");
            return true;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            System.out.println("第一次登录没有session,放行");
            return true;
        }
        System.out.println("没有登录，准备跳转到登录页面");
        System.out.println("RequestURI=>"+request.getRequestURI());
        System.out.println("ContextPath=>"+request.getContextPath());
        request.getRequestDispatcher("/user/goLogin").forward(request, response);//过分了
        return false;
    }
}
