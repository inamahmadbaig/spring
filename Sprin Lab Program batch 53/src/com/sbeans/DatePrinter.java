package com.sbeans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatePrinter {

    private LocalDateTime currentDateTime;

    // Setter Injection
    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void printDate() {
        // Formatting date + time
    	System.out.println("DatePrinter.printDate()");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = currentDateTime.format(formatter);

        System.out.println(formatted);
    }
}