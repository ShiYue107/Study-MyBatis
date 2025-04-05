package com.shiyue.test;

import com.shiyue.mapper.UserMapper;
import com.shiyue.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author：ShiYue
 * @Date：06/03/2025-3:38 pm
 * @Description：
 * @Version：v1.0
 */
public class UserMapperTest {

    @Test
    public void testInsert() throws IOException {

        //1、加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2、获取sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3、获取SqlSessionFactory
        SqlSessionFactory factory = builder.build(inputStream);
        //4、获取sqlSession
        SqlSession sqlSession = factory.openSession();
        //5、获取mapper对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        sqlSession.commit();
        System.out.println("result:---->" + result);
    }

    @Test
    public void testDelete() throws IOException {

        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(stream);

        SqlSession sqlSession = factory.openSession(true);

        int result = sqlSession.getMapper(UserMapper.class).deleteUser();

        System.out.println("result:---->" + result);

    }

    @Test
    public void testUpdate() throws IOException {

        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory build = factoryBuilder.build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.updateUser();
        System.out.println("result:---->" + result);
    }

    @Test
    public void testSelect() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        /*User user = userMapper.selectUserById();
        System.out.println(user);*/
        List<User> users = userMapper.selectUserAll();

        for (User user : users) {
            System.out.println(user);
        }
    }

}
