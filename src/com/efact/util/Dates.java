package com.efact.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Dates {
	
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	
	public static String getCurrentDateFirstDayOfMonth() {
		Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.DAY_OF_MONTH, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	public static String getCurrentDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(new Date());
	}

	public static String getDateOneYearAgo() {
		Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.add(Calendar.YEAR, -1);
        
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	public static String getDateTwoMonthsAgo() {
		Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.add(Calendar.MONTH, -2);
        
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}

	public static String strToDate(String s) {

		try {
			
			SimpleDateFormat original = new SimpleDateFormat("yyyyMMdd");
			Date date = original.parse(s);
			SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			return newFormat.format(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static String intToDate(int s) {

		try {
			SimpleDateFormat original = new SimpleDateFormat("yyyyMMdd");
			Date date = original.parse(String.valueOf(s));
			SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			return newFormat.format(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	

	
	
	
	
}
