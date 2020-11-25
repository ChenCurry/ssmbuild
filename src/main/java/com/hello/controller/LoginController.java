package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/main1")
    public String main1() {
        return "main1";
    }
    @RequestMapping("/goLogin")
    public String login() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password) {
        System.out.println("login=>" + username);
        session.setAttribute("userLoginInfo", username);
        return "main1";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("userLoginInfo");
        return "login";
    }
}
