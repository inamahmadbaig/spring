package com.sbean;

public class Department {
	private int deptid;
	private String deptName;
	
	
	
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public void showDepartment() {
		System.out.println("Department: "+deptName);
	}
}
