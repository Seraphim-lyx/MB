package com.mybatis.mybatis.controller;

import com.mybatis.mybatis.dao.User;
import com.mybatis.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    TestService testService;
    @RequestMapping(value = "/test")
    public String test(Model model){
        testService.test();
        User user = new User();
        user.setName("abc");
        model.addAttribute("user", user);
        return "/user/show";
    }
}
