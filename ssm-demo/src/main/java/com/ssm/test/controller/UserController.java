package com.ssm.test.controller;

import com.ssm.test.domain.User;
import com.ssm.test.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/10/10.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/test")
    public String toIndex(HttpServletRequest servletRequest , Model model){
        int userId = Integer.parseInt(servletRequest.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user",user);
        return "test";
    }
}
