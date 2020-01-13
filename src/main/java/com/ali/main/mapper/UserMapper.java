package com.ali.main.mapper;

import com.ali.main.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author jacob peng
 * @Date 2020/1/13
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
