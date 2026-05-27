package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Patient {
	private String name = "Amit";
	private String disease ="Heart Problem";
	

	public String getPatient() {
		return"Patient: "+name+" ("+disease+")";
	}
}
