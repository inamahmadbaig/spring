package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Professor {
	private String name="Rajesh";
	private String specialization="Java";
	
	
	
	public String showProfessor() {
		return " Professor: "+name+"("+specialization+")";
	}
	
}
