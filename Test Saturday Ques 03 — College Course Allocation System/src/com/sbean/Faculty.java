package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Faculty {
	private int facultyId;
	private String fName;
	private Course course;
	@Autowired
	public Faculty(int facultyId, String fName, Course course) {
		super();
		this.facultyId = facultyId;
		this.fName = fName;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Faculty Id: "+facultyId);
		System.out.println("Faculty Name: "+fName);
		course.getCourse();
	}
}
