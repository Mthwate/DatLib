package com.mthwate.datlib.time;

/**
 * @author mthwate
 * @since 2.0
 */
public final class SystemTicker implements Ticker {

	public static final SystemTicker INSTANCE = new SystemTicker();

	private SystemTicker() {}

	public long nanoTime() {
		return System.nanoTime();
	}

}
