package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Interface.Payment;
import com.bean.PaymentFactory;
import com.cfgss.Configuration;

public class PaymentApp {

	public static void main(String[] args) {
		
			AnnotationConfigApplicationContext ct =
					new AnnotationConfigApplicationContext(Configuration.class);
			
			PaymentFactory paymentFactory = ct.getBean(PaymentFactory.class);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter payment type: ");
			String pyaType = sc.nextLine();
			System.out.println("Enter amount: ");
			double amount;
			try {
			    amount = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid amount! Please enter a valid number (e.g., 100 or 99.99).");
			    return;
			}
			
			Payment payment = paymentFactory.getPayment(pyaType);
			if (payment == null) {
			    return;  // stop execution
			}
			System.out.println(payment.pay(amount));
		
		
	}

}
