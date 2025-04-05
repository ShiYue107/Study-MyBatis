package com.shiyue.mapper;

import com.shiyue.pojo.User;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：06/03/2025-3:15 pm
 * @Description：
 * @Version：v1.0
 */
public interface UserMapper {

    //新增
    int insertUser();

    //删除
    int deleteUser();

    //修改
    int updateUser();

    //查询byId
    User selectUserById();

    //查询all
    List<User> selectUserAll();
}
