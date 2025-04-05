package com.shiyue.mapper;

import com.shiyue.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：08/03/2025-3:49 pm
 * @Description：
 * @Version：v1.0
 */
public interface EmpMapper {

    List<Emp> getDeptAndEmpStepTwo(@Param("did") Integer did);

    Emp getEmpByIdStepOne(@Param("eid") Integer eid);

    Emp getEmpById(@Param("eid") Integer eid);

    List<Emp> selectEmpAll();

}
