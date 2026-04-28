package com.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbean.Doctor;
import com.sbean.Equipment;
import com.sbean.Hospital;

@Configuration
@ComponentScan(basePackages = "com.sbean")
public class AppConfig {
	
	@Bean
	public Doctor getDetails() {
		return new Doctor("Dr. Meena Gupta", "Cardiologist");
	}
	@Bean
	public Equipment getEquiment() {
		return new Equipment("ECG Machine", 250000);
		
	}
	@Bean
	public Hospital getHospital() {
		return new Hospital("City Care Hospital", getDetails(), getEquiment());
	}
}
