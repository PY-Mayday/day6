package com.tutu.shopplatform.Controller;

import com.tutu.shopplatform.Service.UserService;
import com.tutu.shopplatform.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;//注入Service

    @GetMapping("/hello")
    public String hello1(){
        return "get hello111111";
    }
    @PostMapping("/hello")
    public String hello2(){
        return "post hello";
    }

//    @GetMapping("/login")
//    public String getUserLoginInfo() {
//        User user = userService.selectUserByName("tutu");
//        String res = user.getUserName();
//        return res;
//    }
}
