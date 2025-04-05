package com.shiyue.mapper;

import com.shiyue.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-4:51 pm
 * @Description：
 * @Version：v1.0
 */
public interface SelectMapper {
    @MapKey("id")
    Map<Object,Object> selectUserAllToMap();
//    List<Map<Object,Object>> selectUserAllToMap();

    Map<String,Object> selectUserByIdToMap(@Param("id") Integer id);

    Integer selectUserCount();

    List<User> selectUserAll();

    User selectUserById(@Param("id")Integer id);

}
