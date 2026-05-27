package com.bean;


import org.springframework.stereotype.Component;

@Component
public class Doctor {
	private String name = "Dr. Sharma ";
	private String specialization ="Cardiologist";

	public String getDoctor() {
		return "Doctor: "+name+" ("+specialization+")";
	}
	
}
