package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Order {
	private int orderId=101;
	private Customer customer;
	private Product product;
	@Autowired
	public Order(Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	
	public String showDetails() {
		return "Order ID: "+orderId+" "+customer.getCoustomer()+" "+product.getProduct();
		
	}
}
