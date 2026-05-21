package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean.Address;
import com.sbean.Department;
import com.sbean.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Department getDepartment() {
		Department d = new Department();
		d.setDeptName("IT");
		return d;
		}
	@Bean
	public Address getAddress() {
		Address a = new Address();
		a.setCity("Pune");
		a.setCountry("India");
		return a;
		
	}
	
	@Bean
	public Employee getEmployee() {
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Rohit Sharma");
		return e;
	}
}
