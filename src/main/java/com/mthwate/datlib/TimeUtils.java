package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.0
 */
public class TimeUtils {

	/**
	 * Sleeps for the specified time.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 1.0
	 * @param milli the time to sleep in milliseconds
	 */
	public static void sleep(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {}
	}

	/**
	 * Sleeps for the specified time.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 1.3
	 * @param sec the time to sleep in seconds
	 */
	public static void sleepSec(long sec) {
		sleep(sec * 1000);
	}
	
}
