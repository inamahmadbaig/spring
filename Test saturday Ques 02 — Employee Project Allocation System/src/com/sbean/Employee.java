package com.sbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String eName;
	private List<Project> projects;
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Autowired
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public void display() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+eName);
		System.out.println("Project Details");
		
		for(Project p : projects) {
			p.getProject();
		}
	}
	
	
}
