package com.shiyue.test;

import com.shiyue.mapper.SelectMapper;
import com.shiyue.pojo.User;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-4:53 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo1 {
    @Test
    public void selectAllToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        Map<Object, Object> objectObjectMap = mapper.selectUserAllToMap();
        System.out.println(objectObjectMap);

//        List<Map<Object, Object>> maps = mapper.selectUserAllToMap();
//        System.out.println(maps);
    }

    @Test
    public void selectByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        Map<String, Object> stringObjectMap = mapper.selectUserByIdToMap(3);
        System.out.println(stringObjectMap);
    }

    @Test
    public void selectCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        System.out.println(mapper.selectUserCount());
    }

    @Test
    public void selectAll() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        List<User> users = mapper.selectUserAll();

        System.out.println(users);
    }

    @Test
    public void selectById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        User user = mapper.selectUserById(3);

        System.out.println(user);
    }
}
