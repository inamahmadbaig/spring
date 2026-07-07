package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.OttProvider;
import com.cfg.Appcfgs;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(Appcfgs.class);
		OttProvider ottProvider = ct.getBean(OttProvider.class);
		ottProvider.display("prime");
		
	}

}
