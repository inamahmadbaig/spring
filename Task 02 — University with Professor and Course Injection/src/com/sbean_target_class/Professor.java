package com.sbean_target_class;

public class Professor {

	private String name;

	private int yearsOfExperience;

	public Professor(String name, int yearsOfExperience) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void showProfessor() {
		System.out.println("Professor Name : "+name+" ("+yearsOfExperience+" year experience)");
	}

}
