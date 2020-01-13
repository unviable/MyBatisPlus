package com.ali.main.handler;

import com.ali.main.pojo.User;
import com.ali.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@RestController
public class UserHandler {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> all(){
        return userService.findAll();
    }
}
