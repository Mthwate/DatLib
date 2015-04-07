package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.0
 */
public class Timer {

	private long start;

	public Timer() {
		start();
	}

	public void start() {
		start = System.nanoTime();
	}

	public double getNano() {
		return System.nanoTime() - start;
	}

	public double getSec() {
		return getNano() / 1000000000d;
	}

}
