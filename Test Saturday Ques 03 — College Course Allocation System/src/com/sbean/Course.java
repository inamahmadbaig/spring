package com.sbean;

public class Course {
	private int courseId;
	private String courseName;
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public void getCourse() {
		System.out.println("Course ID: "+courseId);
		System.out.println("Course Name: "+courseName);
	}
}
