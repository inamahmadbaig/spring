package com.sbean;

public class Doctor {
	private String name;
	private String specialization;
	
	public Doctor(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}
	
	

	public void showDoctor() {
		System.out.println("prints doctor details");
		System.out.println("Name " +name);
		System.out.println("specialization " +specialization);
		System.out.println();
	}
}
