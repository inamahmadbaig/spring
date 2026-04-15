package com.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbens.MonthEndReminder;

public class App {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext xl = new FileSystemXmlApplicationContext("src/com/cfgs/NewFile.xml");
		
		MonthEndReminder rem = xl.getBean("re",MonthEndReminder.class);
		rem.checkMonthEnd();
	}
}
