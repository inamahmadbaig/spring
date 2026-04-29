package com.sbeans;

import java.time.LocalTime;

public class TimeService {

    public String currentHour(String name) {

        int hour = LocalTime.now().getHour();
        System.out.println(hour);
        if (hour < 12) {
            return "Good Morning " + name;
        } else if (hour < 16) {
            return "Good Afternoon " + name;
        } else if (hour < 20) {
            return "Good Evening " + name;
        } else {
            return "Good Night " + name;
        }
    }
}