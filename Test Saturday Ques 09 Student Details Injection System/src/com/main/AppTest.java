package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.cfgs.Appcfgs;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Appcfgs.class);
		Student student = ct.getBean(Student.class);
		student.showDetails();
	}

}
