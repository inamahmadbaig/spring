package com.cfgs;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Department;
import com.sbean.Employee;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class Application {
	@Bean
	public Department getDept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Depatment id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter department name");
		String dName = sc.nextLine();
		return new Department(id, dName);
	}
	@Bean
	public Employee getEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id ");
		int eid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name ");
		String eName = sc.nextLine();
		return new Employee(eid, eName, getDept());
	}
}
