package com.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sbeans.TimeService;

public class AppMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext xl =
				new FileSystemXmlApplicationContext("src/com/cfgs/NewFile.xml");
		TimeService src = xl.getBean("timeService",TimeService.class);
		System.out.println(src.currentHour("inam"));
	}
}
