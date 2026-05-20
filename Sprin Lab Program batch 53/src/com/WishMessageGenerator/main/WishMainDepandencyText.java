package com.WishMessageGenerator.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.WishMessageGenerator.sbeans.WishMassage;

public class WishMainDepandencyText {
	public static void main(String[] args) {
		
		//IOC create
		FileSystemXmlApplicationContext xml =
			    new FileSystemXmlApplicationContext("src/com/WishMessageGenerator/cfgs/application.xml");		//spring bean class object ref
		Object obj = xml.getBean("ws");
		//type casting
		WishMassage generator = (WishMassage) obj;
	
		String msg = generator.generateWishMessage(" Inam ");
		System.out.println(msg);
		xml.close();
	}
}
