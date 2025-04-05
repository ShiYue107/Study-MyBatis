package com.shiyue.mapper;

import com.shiyue.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：09/03/2025-8:20 pm
 * @Description：
 * @Version：v1.0
 */
public interface DynamicSQLMapper {

    Integer insertMoreEmp(@Param("emps") List<Emp> emps);

    Integer deleteMoreEmp(@Param("eids") Integer[] eids);

    List<Emp> selectMoreEmp(Emp emp);
}
