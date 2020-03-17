package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@Controller
public class HomeController {
    @RequestMapping("/test")
    public String Index() {
        return "Hello Spring!";
    }
    @RequestMapping("/hello")
    public String Hello(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面！");
        return "/index";
    }
}