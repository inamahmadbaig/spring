package com.sbean_target_class;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	private String universityName;
	private Professor professor;
	private Course course;
	
	@Autowired
	public University(String universityName, Professor professor, Course course) {
		super();
		this.universityName = universityName;
		this.professor = professor;
		this.course = course;
	}
	
	public void showDetails() {
		System.out.println("university Name : "+universityName);
		professor.showProfessor();
		course.showCourse();
	}
}
