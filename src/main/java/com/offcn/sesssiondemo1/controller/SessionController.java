package com.offcn.sesssiondemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {
    @RequestMapping("/set")
    public String setSession(HttpSession session) {
        session.setAttribute("name", "5062");
        return "success";
    }

    @RequestMapping("/get")
    public String getSession(HttpSession session) {
        String name = (String) session.getAttribute("name");
        return name;
    }
}
