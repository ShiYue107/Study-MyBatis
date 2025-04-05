package com.shiyue.test;

import com.shiyue.mapper.EmpMapper;
import com.shiyue.pojo.Emp;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：08/03/2025-3:55 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo {

    @Test
    public void selectEmpAll(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> emps = mapper.selectEmpAll();

        emps.forEach(emp -> System.out.println(emp));

    }
}
