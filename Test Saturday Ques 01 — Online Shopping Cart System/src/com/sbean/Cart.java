package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Cart {
	private int cartId;
	private String userName;
	private Product product;
	
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Autowired
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getCart() {
		return "Cart Id: "+cartId+" User Name: "+userName+" "+product.getProduct();
	}
	
}
