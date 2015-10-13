package com.mthwate.datlib.math;

import com.mthwate.datlib.math.calculator.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
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
	 * @return the greatest common divisor as an integer
	 */
	public static int gcd(int a, int b) {
		return gcd(a, b, Calculator.INTEGER_CALCULATOR);
	}

	/**
	 * Gets the greatest common divisor of 2 numbers.
	 *
	 * @since 1.3
	 * @param a the first long
	 * @param b the second long
	 * @return the greatest common divisor as a long
	 */
	public static long gcd(long a, long b) {
		return gcd(a, b, Calculator.LONG_CALCULATOR);
	}

	/**
	 * Gets the greatest common divisor of 2 numbers.
	 *
	 * @since 1.3
	 * @param a the first BigInteger
	 * @param b the second BigInteger
	 * @return the greatest common divisor as a BigInteger
	 */
	public static BigInteger gcd(BigInteger a, BigInteger b) {
		return gcd(a, b, Calculator.BIG_INTEGER_CALCULATOR);
	}

	private static <T> T gcd(T a, T b, Calculator<T> calculator) {
		T ta = a;
		T tb = b;

		while (!tb.equals(calculator.getZero())) {
			T mod = calculator.modulo(ta, tb);
			ta = tb;
			tb = mod;
		}

		return calculator.abs(ta);
	}

	/**
	 * Gets the least common multiple of 2 numbers.
	 *
	 * @since 1.3
	 * @param a the first integer
	 * @param b the second integer
	 * @return the least common multiple as an integer
	 */
	public static int lcm(int a, int b) {
		return lcm(a, b, Calculator.INTEGER_CALCULATOR);
	}

	/**
	 * Gets the least common multiple of 2 numbers.
	 *
	 * @since 1.3
	 * @param a the first long
	 * @param b the second long
	 * @return the least common multiple as a long
	 */
	public static long lcm(long a, long b) {
		return lcm(a, b, Calculator.LONG_CALCULATOR);
	}

	/**
	 * Gets the least common multiple of 2 numbers.
	 *
	 * @since 1.3
	 * @param a the first BigInteger
	 * @param b the second BigInteger
	 * @return the least common multiple as a BigInteger
	 */
	public static BigInteger lcm(BigInteger a, BigInteger b) {
		return lcm(a, b, Calculator.BIG_INTEGER_CALCULATOR);
	}

	private static <T> T lcm(T a, T b, Calculator<T> calculator) {
		return calculator.multiply(a, calculator.divide(b, gcd(a, b, calculator)));
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
		return bd.setScale(decimals, roundingMode).doubleValue();
	}

}
