package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfigs.AppConfig;
import com.bean.LoanService;


public class LoanApplicationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ct = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		LoanService loanService = ct.getBean(LoanService.class);
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Loan Type (homeLoanInterest / carLoanInterest / personalLoanInterest):");

		String loneTyep = sc.nextLine();
		
		System.out.println("Enter Loan Amount ");
		double loanAmount = Double.parseDouble(sc.nextLine());
		System.out.println("enter time loan ");
		int loanYear = Integer.parseInt(sc.nextLine());
		
		double result = loanService.calculateLoanInterest(loneTyep, loanAmount, loanYear);
		
		System.out.println(result);
		
	}
}
