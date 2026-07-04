package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Course;
import com.sbean.Faculty;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class App {

	@Bean
	public Course course() {
		Course c = new Course(202, "Java");
		return c;
	}
	@Bean
	public Faculty faculty() {
		Faculty f = new Faculty(01, "Ravi Sankar", course());
		return f;
	}
}
