package com.sbean;

public class Principal {
	private String name;
	private int experience;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}


	public void display() {
		System.out.println("Principal: "+name+" ("+experience+" years experience)");
	}
}
