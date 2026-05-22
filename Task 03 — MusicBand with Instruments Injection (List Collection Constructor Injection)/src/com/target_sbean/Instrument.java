package com.target_sbean;

public class Instrument {
	private String name;
	private String type;
	
	public Instrument(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void showInstrument() {
		System.out.println("Name: "+name+" (Type: "+type+")");
	}
}
