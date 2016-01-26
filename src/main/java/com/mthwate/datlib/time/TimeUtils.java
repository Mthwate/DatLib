package com.mthwate.datlib.time;

import java.util.concurrent.TimeUnit;

/**
 * @author mthwate
 * @since 2.0
 */
public class TimeUtils {

	/**
	 * Sleeps for the specified amount of time.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 2.0
	 * @param unit the units of time to sleep for
	 * @param time the time to sleep
	 */
	public static void sleep(TimeUnit unit, long time) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			// The thread's interrupt status is cleared when this exception is thrown
			// Reset the thread status to interrupted
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Sleeps for the specified amount of time in milliseconds.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 2.0
	 * @param milli the time to sleep in milliseconds
	 */
	public static void sleep(long milli) {
		sleepMilli(milli);
	}

	/**
	 * Sleeps for the specified amount of time in milliseconds.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 2.0
	 * @param milli the time to sleep in milliseconds
	 */
	public static void sleepMilli(long milli) {
		sleep(TimeUnit.MILLISECONDS, milli);
	}

	/**
	 * Sleeps for the specified amount of time in seconds.
	 * This method does not throw an exception on interruption.
	 *
	 * @since 2.0
	 * @param sec the time to sleep in seconds
	 */
	public static void sleepSec(long sec) {
		sleep(TimeUnit.SECONDS, sec);
	}
	
}
