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
	
	
}
