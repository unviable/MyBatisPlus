package com.ali.main.handler;

import com.ali.main.pojo.User;
import com.ali.main.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    /**

     *@descpriton   like模糊查询，查询名字中包含字母"o"的用户

     *@parameter  QueryWrapper<User>

     *@return   查询的结果集

     *@author  jacob

     *@date  2020/01/13

     *@Reviser  无

     */
    @RequestMapping("/find")
    public List<User> find(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        /**
         *@descpriton   给QueryWrapper设置模糊查询的条件
         *@parameter  模糊查询like的条件
         *
         */
        queryWrapper.like("name","o");
        return userService.fingByQueryWrapper(queryWrapper);
    }
    /**

     *@descpriton   条件查询

     *@parameter  查询条件，如Id等

     *@return  数据的结果集

     *@author  jacob

     *@date  2020/01/13

     *@Reviser  无

     */
    public List<User> find1(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        /**
         *@descpriton   设置查询条件 K-V形式
         *@parameter  年龄小于20
         *
         */
        queryWrapper.le("age",20);
        return userService.fingByQueryWrapper(queryWrapper);
    }
}
