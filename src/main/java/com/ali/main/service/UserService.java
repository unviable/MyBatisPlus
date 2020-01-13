package com.ali.main.service;

import com.ali.main.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.List;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
public interface UserService {

    public List<User> findAll();

    public List<User> fingByQueryWrapper(QueryWrapper<User> queryWrapper);
}
