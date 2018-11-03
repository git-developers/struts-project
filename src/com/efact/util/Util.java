package com.efact.util;

import java.sql.Date;

public class Util {

	public static int strToInt(String s) {
        try {
        	return Integer.parseInt(s);
         } catch (NumberFormatException e) {
        	 return -1;
         }
	}
	
	public static Date strToDate(String s) {
		try {
			return Date.valueOf(s);
		}catch (IllegalArgumentException e) {
			return null;
		}
	}
	
	public static boolean floatToBool(float s) {
		try {
			return s > 0 ? true : false;
		}catch (Exception e) {
			return false;
		}
	}
	
	public static int strDateToInt(String s) {
		try {
			return Integer.valueOf(s.replace("-", ""));
		}catch (NumberFormatException e) {
			return -1;
		}
	}

	public static int intDateToInt(int s) {
		try {
			String ss = String.valueOf(s);
			return Integer.valueOf(ss.replace("-", ""));
		}catch (NumberFormatException e) {
			return -1;
		}
	}
}
