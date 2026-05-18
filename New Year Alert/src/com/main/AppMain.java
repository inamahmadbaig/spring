package com.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbeans.YearProcessor;

public class AppMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext xl =
				new FileSystemXmlApplicationContext("src/com/cfgs/NewFile.xml");
		YearProcessor processor = xl.getBean("yearPro",YearProcessor.class);
		processor.checkMonth();
	}
}
