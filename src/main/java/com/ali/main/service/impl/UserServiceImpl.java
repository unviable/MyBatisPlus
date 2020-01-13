package com.ali.main.service.impl;

import com.ali.main.mapper.UserMapper;
import com.ali.main.pojo.User;
import com.ali.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;
    /**
     *@return  按条件查询返回结果

     *@author  jacob

     *@date  2020/01/13

     *@Reviser

     */
    @Override
    public List<User> findAll() {
        List<User> users = mapper.selectList(null);
        return users;
    }
}
