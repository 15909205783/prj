package com.yangfan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 */
@Controller
@RequestMapping(path = "/hell")
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello()
    {
        System.out.println("Hello SpringMVC");
        return "success";
    }

    @RequestMapping(path = "/RM")
    public String textRequestMapping()
    {
        System.out.println("textRequestMapping()方法执行中......");
        return "RMtest";
    }
}

