package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empId;
	private String empName;
	private Department department;
	private Address address;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}


	public void showEmployeeDetails() {
		System.out.println("Employee ID: "+empId+", "+"Name: "+empName);
		department.showDepartment();
		address.showAddress();
	}
}
