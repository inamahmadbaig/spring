package com.sbean;

import org.springframework.stereotype.Component;

@Component
public class Author {
	private String name="John";
	private int experience=10;
	
	public String getAuthor() {
		return "Author: "+name+" ("+experience+" years Experience)";
	}
}
