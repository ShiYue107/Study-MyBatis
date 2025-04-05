package com.shiyue.test;

import com.shiyue.mapper.SQLMapper;
import com.shiyue.pojo.User;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-8:11 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo2 {

    @Test
    public void testDeleteMore(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        Integer result = mapper.deleteUserMore("3,5");

        System.out.println(result);

    }

    @Test
    public void testSelectByLike(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        List<User> users = mapper.selectUserByLike("12");
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void testSelectAll(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        List<User> list = mapper.getUserList("t_user");
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);

        User user = new User(null,"张无忌","zhangwuji",88,"男","zwj@qq.com");

        mapper.insertUser(user);
        System.out.println(user);
    }
}
