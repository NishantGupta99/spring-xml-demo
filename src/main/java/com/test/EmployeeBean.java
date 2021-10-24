package com.test;

public class EmployeeBean {
	private DepartmentBean departmentBean; // dependency

	public EmployeeBean(DepartmentBean departmentBean, String fullName) {
		this.departmentBean = departmentBean;
		this.fullName = fullName;
	}

	private String fullName;

	void applyJob() {
		System.out.println(departmentBean);
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