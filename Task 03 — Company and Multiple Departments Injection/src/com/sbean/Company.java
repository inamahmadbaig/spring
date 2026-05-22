package com.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	private List<Department> departments;
	@Autowired
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public void showDepartments() {
		System.out.println("---- Company Departments ----");
		for(Department dpt: departments) {
			dpt.showDepartment();
		}
	}

	
	
}
