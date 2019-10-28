package com.weilin.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weilin.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/say.do")
    @ResponseBody
    public String say(String name){
        String s = userService.say(name);
        return s;
    }
}
