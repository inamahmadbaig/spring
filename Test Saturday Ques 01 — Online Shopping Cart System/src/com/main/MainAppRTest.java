package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.congf.AppCgfs;
import com.sbean.Cart;

public class MainAppRTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct =
				new AnnotationConfigApplicationContext(AppCgfs.class);
		
		Cart c = ct.getBean(Cart.class);
		System.out.println(c.getCart());
	}
}
