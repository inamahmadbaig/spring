package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean_target_class.Course;
import com.sbean_target_class.Professor;
import com.sbean_target_class.University;

@Configuration
public class AppConfig {
	@Bean
	public Professor getProfessor() {
		return new Professor("Dr. Suresh Iyer", 15);
	}
	@Bean
	public Course getCourse() {
		return new Course("Data Science ", 6);
	}
	@Bean
	public University getUniversity() {
		return new University("National Institute of Technology", getProfessor(), getCourse());
	}
}
