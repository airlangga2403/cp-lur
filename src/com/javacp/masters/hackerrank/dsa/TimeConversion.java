package com.javacp.masters.hackerrank.dsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45 PM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        SimpleDateFormat sdf12Hour = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat timeFormat24Hours = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date = sdf12Hour.parse(s);
            return timeFormat24Hours.format(date);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
}
