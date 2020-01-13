package com.ali.main.service.impl;

import com.ali.main.mapper.UserMapper;
import com.ali.main.pojo.User;
import com.ali.main.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Service
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
    /**

     *@descpriton   mp自带的BaseMapper封装了一些查询方法，其查询的条件一般都是QueryWrapper，
     * 泛型为数据库对应的实体类

     *@parameter  BaseMapper自带的查询方法的参数

     *@return  查询的结果集

     *@author  jacob

     *@date  2020/01/13

     *@Reviser  无

     */
    @Override
    public List<User> fingByQueryWrapper(QueryWrapper<User> queryWrapper) {
        return mapper.selectList(queryWrapper);
    }
}
