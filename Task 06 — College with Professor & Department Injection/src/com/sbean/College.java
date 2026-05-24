package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private String collegeName = " ABC Engineering College ";
	private Professor professor;
	private Department department;
	@Autowired
	public College(Professor professor, Department department) {
		super();
		this.professor = professor;
		this.department = department;
	}
	
	public String showCollage() {
		return "Collage: "+collegeName+" "+professor.showProfessor()+" "+department.showDepartment();
	}


	
}
