package com.sbean;

public class MenuItem {

	private int itemId;
    private String itemName;
    private double price;
    
    
	public MenuItem(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    public void showItem() {
    	System.out.println("Item ID: "+itemId+", Name: "+itemName+", Price: "+price);
    }
}
