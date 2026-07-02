package com.sbean;

public class Product {
	private int productId;
	private String name;
	private double price;
	
	
	public void setProductId(int productId) {
		this.productId = productId;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getProduct() {
		return "ProductID: "+ productId+" Product Name: "+name+" Product Price "+price;
		
	}
}
