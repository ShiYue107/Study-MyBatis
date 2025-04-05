package com.shiyue.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author：ShiYue
 * @Date：07/03/2025-3:21 pm
 * @Description：
 * @Version：v1.0
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() {

        InputStream stream = null;
        try {
            stream = Resources.getResourceAsStream("mybatis-config.xml");

            return new SqlSessionFactoryBuilder().build(stream).openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
