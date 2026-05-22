package com.sbean;

public class Department {
	private int deptId;
	private String deptName;
	
	
	public Department(int deptId,String deptName ) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public void showDepartment() {
		System.out.println("---- Company Departments ----");
		 System.out.println("Department ID:"+deptId+", Name: "+deptName);
	}
}
