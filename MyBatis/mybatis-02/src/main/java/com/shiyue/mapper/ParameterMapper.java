package com.shiyue.mapper;

import com.shiyue.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-3:08 pm
 * @Description：
 * @Version：v1.0
 */
public interface ParameterMapper {

    User selectUserByParam(@Param("username")String username, @Param("password")String password);

    int insertUser(User user);

    User selectUserByMap(Map<String, Object> map);

    /**
     * 通过用户名查询
     * @return User
     */
    User selectUserByUserName(String userName);

    /**
     * 通过账号、密码查询
     * @param userName 用户名
     * @param password 密码
     * @return User
     */
    User selectUser(String userName, String password);

    /**
     * 查询所有数据
     * @return List<User>
     */
    List<User> selectAllUser();

}
