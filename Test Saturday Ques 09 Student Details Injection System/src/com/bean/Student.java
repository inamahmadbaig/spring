package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("${stu.id}")
	private int studentId;
	@Value("${stu.name}")
	private String studentName;
	@Value("${stu.course}")
	private String course;
	
	public void showDetails() {
		System.out.println("studentId: "+studentId);
		System.out.println("studentName: "+studentName);
		System.out.println("course: "+course);
	}
	
}
