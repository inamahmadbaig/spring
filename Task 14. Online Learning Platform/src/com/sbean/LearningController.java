package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LearningController {

	private JavaCourse javaCourse;
	
	private PythonCourse pythonCourse;
	
	private DataScienceCourse dataScienceCourse;
	
	
	@Autowired
	public LearningController(JavaCourse javaCourse, PythonCourse pythonCourse, DataScienceCourse dataScienceCourse) {
		super();
		this.javaCourse = javaCourse;
		this.pythonCourse = pythonCourse;
		this.dataScienceCourse = dataScienceCourse;
	}
	public String enrollJavaCourse() {
		return"Enrolled in "+javaCourse.getCourseName()+"\n"
		+"Delivered via "+javaCourse.getDeliveryMode().deliver(javaCourse.getCourseName());
	}
	public String enrollPythonCourse() {
		return"Enrolled in "+pythonCourse.getCourseName()+"\n"
		+"Delivered via "+pythonCourse.getDeliveryMode().deliver(pythonCourse.getCourseName());
	}
	public String enrollDataScienceCourse() {
		return"Enrolled in "+dataScienceCourse.getCourseName()+"\n"+
		"Delivered via "+dataScienceCourse.getDeliveryMode().deliver(dataScienceCourse.getCourseName());
	}

}
