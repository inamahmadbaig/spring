package com.sbean_target_class;

public class Course {
	private String courseName;
	private int duration;
	
	public Course(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}

	public void showCourse() {
		System.out.println("course Name : "+courseName+" (Duration: "+duration+" months)");
	}
	
}
