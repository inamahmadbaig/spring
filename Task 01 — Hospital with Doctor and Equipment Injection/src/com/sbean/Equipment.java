package com.sbean;

public class Equipment {
	private String equipmentName;
	private double cost;
	
	public Equipment(String equipmentName, double cost) {
		super();
		this.equipmentName = equipmentName;
		this.cost = cost;
	}

	public void showEquipment() {
//		System.out.println("prints equipment info");
		System.out.println("equipment Name "+equipmentName);
		System.out.println("equipment cost ₹"+cost);
		System.out.println();
	}
}
