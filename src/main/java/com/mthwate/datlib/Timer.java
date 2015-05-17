package com.mthwate.datlib;

import com.mthwate.datlib.math.MathUtils;

/**
 * @author mthwate
 * @since 1.0
 */
public class Timer {

	private long start;

	/**
	 * Creates and starts a new timer.
	 *
	 * @since 1.0
	 */
	public Timer() {
		start();
	}

	/**
	 * Starts the timer.
	 *
	 * @since 1.0
	 */
	public void start() {
		start = System.nanoTime();
	}

	/**
	 * Gets the nanoseconds that have passed.
	 *
	 * @since 1.0
	 * @return the nanoseconds that have passed
	 */
	public long getNano() {
		return System.nanoTime() - start;
	}

	/**
	 * Gets the seconds that have passed.
	 *
	 * @since 1.0
	 * @return the seconds that have passed
	 */
	public double getSec() {
		return getNano() / 1_000_000_000.0;
	}

	/**
	 * Gets the seconds that have passed, rounding to the supplied number of decomal places.
	 *
	 * @since 1.1
	 * @param decimals the number of decimal places to round to
	 * @return the seconds that have passed
	 */
	public double getSec(int decimals) {
		return MathUtils.round(getSec(), decimals);
	}

}
