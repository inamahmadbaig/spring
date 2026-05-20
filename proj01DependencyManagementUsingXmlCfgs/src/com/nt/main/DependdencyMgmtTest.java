package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerato;


public class DependdencyMgmtTest {
	public static void main(String[] args) {
		//create IOC container
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//get target spring bean class obj ref
		Object obj = ctx.getBean("wmg");
		
		//type casting
		WishMessageGenerato genrater = (WishMessageGenerato)obj;
		
		//invoke (calling ) the b.method
		
		String result = genrater.showWishMassage("inam");
		System.out.println(result);
		
		//close the IOC container
	}
}
