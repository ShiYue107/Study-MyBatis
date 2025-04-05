package com.shiyue.pojo;

import java.util.List;

/**
 * @Author：ShiYue
 * @Date：08/03/2025-3:47 pm
 * @Description：
 * @Version：v1.0
 */
public class Dept {

    private Integer did;
    private String deptName;

    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept() {
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
