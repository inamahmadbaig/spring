package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	private String hospitalName=" City Hospital";
	private Doctor doctor;
	private Patient patient;
	@Autowired
	public Hospital( Doctor doctor, Patient patient) {
		super();
		this.doctor = doctor;
		this.patient = patient;
	}
	
	public String showDetails() {
		return "Hospital: "+hospitalName+""+doctor.getDoctor()+""+patient.getPatient();
	}
}
