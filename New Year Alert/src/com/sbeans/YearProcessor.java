package com.sbeans;

public class YearProcessor {
	private YearService yearService;

	public void setYearService(YearService yearService) {
		this.yearService = yearService;
	}
	
	public void checkMonth() {
		String month = yearService.getMonth();
		if(month.equalsIgnoreCase("JUNARY")) {
			System.out.println("HAPPY new Year");
			
		}else if(month.equalsIgnoreCase("DECEMBER")) {
			System.out.println("Get ready for the new year!");
			
		}else {
			System.out.println("Regular month.");
		}
	}
}
