package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.target_sbean.MusicBand;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		MusicBand ms = ct.getBean(MusicBand.class);
		ms.showBandDetails();
		
	}
}
