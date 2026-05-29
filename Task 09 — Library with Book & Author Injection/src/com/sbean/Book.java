package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String title =" Spring Boot Guide";
	private double price = 500d;
	
	public String getBook() {
		return "Book: "+title+"("+price+")"; 
	}
}
