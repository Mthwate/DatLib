package com.mthwate.datlib.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author mthwate
 * @since 1.0
 */
public class MathUtils {

	/**
	 * Gets the greatest common divisor of 2 numbers.
	 *
	 * @since 1.0
	 * @param a the first integer
	 * @param b the second integer
	 * @return the greatest common divisor
	 */
	public static int gcd(int a, int b) {
		return (b == 0) ? Math.abs(a) : Math.abs(gcd(b, a % b));
	}

	/**
	 * Rounds a number to the specified number of decomal places.
	 *
	 * @since 1.1
	 * @param value the number to round
	 * @param decimals the number of decimal places
	 * @return the rounded number
	 */
	public static double round(double value, int decimals) {
		return round(value, decimals, RoundingMode.HALF_UP);
	}

	/**
	 * Rounds a number to the specified number of decomal places.
	 *
	 * @since 1.1
	 * @param value the number to round
	 * @param decimals the number of decimal places
	 * @param roundingMode the method to use for rounding
	 * @return the rounded number
	 */
	public static double round(double value, int decimals, RoundingMode roundingMode) {
		if (decimals < 0) {
			throw new IllegalArgumentException("Invalid number of decimal places");
		}

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(decimals, roundingMode);
		return bd.doubleValue();
	}

}
