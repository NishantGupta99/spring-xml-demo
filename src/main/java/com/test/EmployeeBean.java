package com.test;

public class EmployeeBean
{
    private DepartmentBean departmentBean ; //dependency
     
    private String fullName;
 
    void applyJob() {
    	departmentBean.receiveApplication();
    }
    
    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }
    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}