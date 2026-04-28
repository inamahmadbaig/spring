package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Hospital {
	private String hospitalName;
	private Doctor doctor;
	private Equipment equipment;
	
	@Autowired
	public Hospital(String hospitalName, Doctor doctor, Equipment equipment) {
		super();
		this.hospitalName = hospitalName;
		this.doctor = doctor;
		this.equipment = equipment;
	}
	
	public void showDetails() {
		System.out.println("display full hospital info");
		doctor.showDoctor();
		equipment.showEquipment();
	}
	
}
