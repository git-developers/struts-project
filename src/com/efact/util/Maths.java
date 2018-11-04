package com.efact.util;

import java.math.BigDecimal;

public class Maths {

	public static float roundNumber(double s, int decimalPlaces) {
		BigDecimal bigDecimal = new BigDecimal(s);
        return bigDecimal.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	
}
