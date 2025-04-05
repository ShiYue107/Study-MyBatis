package com.shiyue.mapper;

import com.shiyue.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-8:09 pm
 * @Description：
 * @Version：v1.0
 */
public interface SQLMapper {

    Integer insertUser(User user);

    List<User> getUserList(@Param("tableName") String tableName);

    Integer deleteUserMore(@Param("ids") String ids);

    List<User> selectUserByLike(@Param("password") String password);

}
