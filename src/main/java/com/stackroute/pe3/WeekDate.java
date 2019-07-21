package com.stackroute.pe3;


import java.util.*;
import java.time.*;
import java.text.*;

public class WeekDate {

    public String date( ){
        String resultDate="";
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        resultDate=df.format(c.getTime());
        return resultDate;
    }
}
