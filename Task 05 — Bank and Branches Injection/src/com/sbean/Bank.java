package com.sbean;

import java.util.Map;

public class Bank {
	private String bankName;
	private Map<String, String> branches;
	//Map<String, String> branches → (key = branch code, value = branch location)
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}

	public void showBranches() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Details:");
		
		branches.forEach((code,location)->
			System.out.println("Code: "+code+" -> "+location)
				);
	}
}
