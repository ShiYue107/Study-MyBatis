package com.shiyue.test;

import com.shiyue.mapper.DynamicSQLMapper;
import com.shiyue.pojo.Emp;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：ShiYue
 * @Date：09/03/2025-8:24 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo3 {

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Integer[] eids = new Integer[]{6,7};

        Integer result = mapper.deleteMoreEmp(eids);
        System.out.println("delete result---->" + result);
    }

    @Test
    public void testInsertMoreEmp(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        Emp emp1 = new Emp(null, "abc1", 22, "男", "abc1@qq.com");
        Emp emp2= new Emp(null, "abc2", 22, "女", "abc2@qq.com");
        Emp emp3 = new Emp(null, "abc3", 22, "男", "abc3@qq.com");

        List<Emp> emps = new ArrayList<>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        Integer result = mapper.insertMoreEmp(emps);
        System.out.println("insert result---->" + result);
    }

    @Test
    public void testSelectMore() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

        List<Emp> emps = mapper.selectMoreEmp(new Emp(null, "", 23, "男", ""));
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
