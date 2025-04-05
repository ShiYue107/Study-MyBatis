package com.shiyue.test;

import com.shiyue.mapper.ParameterMapper;
import com.shiyue.pojo.User;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-3:16 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo {

    @Test
    public void test4(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        User user = mapper.selectUserByParam("lisi", "lisi123");

        System.out.println(user);

    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        int result = mapper.insertUser
                (new User(null, "赵雷", "zhaolei", 33, "男", "zhaolei@shiyue.com"));
        System.out.println(result);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("username","root");
        map.put("password","root");

        User user = mapper.selectUserByMap(map);

        System.out.println(user);

    }

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        User user = mapper.selectUserByUserName("root");

        System.out.println(user);

    }

    @Test
    public void test() throws IOException {

        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = factory.openSession(true);

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        List<User> users = mapper.selectAllUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testCRUD() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        /*List<User> users = mapper.selectAllUser();

        for (User user : users) {
            System.out.println(user);
        }*/

        User user = mapper.selectUser("lisi", "lisi123");
        System.out.println(user);

    }

}
