package com.shiyue.test;

import com.shiyue.mapper.DeptMapper;
import com.shiyue.mapper.EmpMapper;
import com.shiyue.pojo.Emp;
import com.shiyue.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author：ShiYue
 * @Date：09/03/2025-4:32 pm
 * @Description：
 * @Version：v1.0
 */
public class TestDemo1 {

    @Test
    public void testSelectEmpDept() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpById(2);
        System.out.println(emp);
    }

    @Test
    public void testSelectEmpDeptStep() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        Emp emp = mapper.getEmpByIdStepOne(1);
        System.out.println(emp.getEmpName());
        System.out.println("==============================");
        System.out.println(emp.getDept());
    }
}
