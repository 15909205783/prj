package com.yangfan.controller;

import com.yangfan.UserService;
import com.yangfan.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView createUser(User user) {
        userService.createUser(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/createSuccess");
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping(path = "/register")
    public String register() {
        return "user/register";
    }
}
