package com.mthwate.datlib.math;

/**
 * @author mthwate
 * @since 1.0
 */
public class MathUtils {

	public static int gcd(int a, int b) {
		return (b == 0) ? Math.abs(a) : Math.abs(gcd(b, a % b));
	}

}
