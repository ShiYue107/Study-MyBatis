package com.shiyue.pojo;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.did
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    private Integer did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.dept_name
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.did
     *
     * @return the value of t_dept.did
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.did
     *
     * @param did the value for t_dept.did
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.dept_name
     *
     * @return the value of t_dept.dept_name
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.dept_name
     *
     * @param deptName the value for t_dept.dept_name
     *
     * @mbggenerated Sun Mar 09 23:31:58 CST 2025
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}