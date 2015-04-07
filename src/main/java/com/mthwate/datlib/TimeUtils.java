package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.0
 */
public class TimeUtils {
	
	public static void sleep(long milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {}
	}
	
}
