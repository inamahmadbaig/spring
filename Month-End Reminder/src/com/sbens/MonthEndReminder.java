package com.sbens;

import java.time.LocalDate;

public class MonthEndReminder {
	public void checkMonthEnd() {
		int day = LocalDate.now().getDayOfMonth();
		if(day == 30 || day == 31) {
			System.out.println("Month is ending, please submit reports.");
		}else {
			System.out.println("\"Continue working as usual.");
		}
	}
}
