package com.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Library {
	private String libraryName="Central Library";
	@Autowired
	private Book book;
	@Autowired
	private Author author;
	
	public String showDetails() {
		return"Library: "+libraryName+" "+book.getBook()+""+author.getAuthor();
	}
	
}
