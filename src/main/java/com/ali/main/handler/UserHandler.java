package com.ali.main.handler;

import com.ali.main.mapper.UserMapper;
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

    @Autowired
    private UserMapper mapper;

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
    @RequestMapping("/find1")
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

    @RequestMapping("/findById")
    public User findById(long id){
        /**
         *@descpriton   按Id查询
         *@parameter  Id
         *
         */
        return mapper.selectById(id);
    }
    @RequestMapping("/insert")
    public void insert(){
        User user = new User();
        user.setAge(21);
        user.setEmail("1132079225@qq.com");
        user.setName("xiaoshuai");
        /**
         *@descpriton   新增数据
         *@parameter  实体类对象
         *
         */
        int count = mapper.insert(user);
        System.out.println("新增数据成功！count>="+count);
    }
    @RequestMapping("/delete")
    public void delete(){
        /**
         *@descpriton   按照Id删除数据
         *@parameter  id
         *
         */
        mapper.deleteById(1);
        System.out.println("删除成功！！");
    }
}
