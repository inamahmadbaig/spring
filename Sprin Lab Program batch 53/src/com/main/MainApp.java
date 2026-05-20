package com.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbeans.DatePrinter;

public class MainApp {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext xml = 
				new FileSystemXmlApplicationContext("src/com/cfgs/applicationContext.xml");
		 DatePrinter printer = xml.getBean("printer", DatePrinter.class);

	        printer.printDate();
	}
}
