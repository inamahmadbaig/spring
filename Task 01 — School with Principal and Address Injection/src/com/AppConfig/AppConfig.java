package com.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbean.Address;
import com.sbean.Principal;
import com.sbean.School;

@Configuration
public class AppConfig {
	@Bean
	public Principal getPrincipal() {
		Principal p = new Principal();
		
		p.setName("Dr. Anil Kumar");
		p.setExperience(20);
		return p;
	}
	@Bean
	public Address getAddress() {
		Address a = new Address();
		
		a.setCity("Hyderbad");
		a.setState("Telangana");
		return a;
	}
	@Bean
	public School getSchool() {
		School s = new School();
		s.setSchoolName(" Sunshine High School");
//		s.setPrincipal(getPrincipal());
//		s.setAddress(getAddress());
		return s;
	}
}
