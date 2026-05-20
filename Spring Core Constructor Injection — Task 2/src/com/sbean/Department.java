package com.sbean;

public class Department {
	private int deptId;
	private String deptName;
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public void getDepartmentDetails() {
		System.out.println(""+deptId);
		System.out.println(""+deptName);
	}

	@Override
	public String toString() {
		return    deptName ;
	}
	
}
