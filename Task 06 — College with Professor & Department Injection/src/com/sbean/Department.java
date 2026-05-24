package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private String deptName = "CSE";
	private String building =" Block A";
	
	
	
	public String showDepartment() {
		return "Department: "+deptName+" - "+building;
	}
}
