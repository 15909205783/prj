package com.yangfan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/param")
public class ParamController {
    /**
     * 请求参数绑定
     *
     * @return
     */
    @RequestMapping(path = "/testParam")
    public String testParam() {
        System.out.println("执行了");
        return "success";
    }
}
