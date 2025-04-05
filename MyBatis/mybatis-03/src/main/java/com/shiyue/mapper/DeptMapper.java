package com.shiyue.mapper;

import com.shiyue.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Author：ShiYue
 * @Date：08/03/2025-3:50 pm
 * @Description：
 * @Version：v1.0
 */
public interface DeptMapper {

    Dept getDeptAndEmpStepOne(@Param("did") Integer did);

    Dept getEmpByIdStepTwo(@Param("did") Integer did);

    Dept getDeptAndEmpById(@Param("did") Integer did);
}
