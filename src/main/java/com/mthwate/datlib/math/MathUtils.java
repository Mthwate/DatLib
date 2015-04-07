package com.mthwate.datlib.math;

/**
 * @author mthwate
 * @since 1.0
 */
public class MathUtils {

	public static int gcd(int a, int b) {
		if (a == 0 && b == 0) {
			throw new IllegalArgumentException("Must supply at least 1 nonzero number");
		}
		return (b == 0) ? Math.abs(a) : Math.abs(gcd(b, a % b));
	}

}
