package com.shiyue.test;

import com.shiyue.mapper.DeptMapper;
import com.shiyue.pojo.Dept;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author：ShiYue
 * @Date：09/03/2025-5:41 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo2 {

    @Test
    public void getDeptAndEmpById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpById(1);

        System.out.println(dept);
    }

    @Test
    public void getDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        Dept dept = mapper.getDeptAndEmpStepOne(2);

        System.out.println(dept);
    }
}
