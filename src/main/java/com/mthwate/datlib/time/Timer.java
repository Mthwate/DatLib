package com.mthwate.datlib.time;

import java.util.concurrent.TimeUnit;

/**
 * @author mthwate
 * @since 2.0
 */
public final class Timer {

	private final Ticker ticker;

	private boolean isRunning;

	private long start;

	private long nano;

	public Timer() {
		this(SystemTicker.INSTANCE);
	}

	public Timer(Ticker ticker) {
		this.ticker = ticker;
	}

	public boolean isRunning() {
		return isRunning;
	}

	/**
	 * Starts the timer.
	 * Does nothing if the timer is already running.
	 *
	 * @since 2.0
	 * @return this timer instance
	 */
	public Timer start() {
		if (!isRunning) {
			start = ticker.nanoTime();
			isRunning = true;
		}
		return this;
	}

	/**
	 * Stops the timer.
	 * Does nothing if the timer is not running.
	 *
	 * @since 2.0
	 * @return this timer instance
	 */
	public Timer stop() {
		if (isRunning) {
			nano += ticker.nanoTime() - start;
			isRunning = false;
		}
		return this;
	}

	/**
	 * Clears the timer and leaves it in a stopped state.
	 *
	 * @since 2.0
	 * @return this timer instance
	 */
	public Timer reset() {
		nano = 0;
		isRunning = false;
		return this;
	}

	/**
	 * Clears and runs the timer
	 *
	 * @since 2.0
	 * @return this timer instance
	 */
	public Timer restart() {
		start = ticker.nanoTime();
		nano = 0;
		isRunning = true;
		return this;
	}

	public long getTime(TimeUnit unit) {
		return unit.convert(getNano(), TimeUnit.NANOSECONDS);
	}

	public long getNano() {
		return isRunning ? ticker.nanoTime() - start + nano : nano;
	}

	public long getMicro() {
		return getTime(TimeUnit.MICROSECONDS);
	}

	public long getMilli() {
		return getTime(TimeUnit.MILLISECONDS);
	}

	public long getSec() {
		return getTime(TimeUnit.SECONDS);
	}

	public long getMin() {
		return getTime(TimeUnit.MINUTES);
	}

	public long getHour() {
		return getTime(TimeUnit.HOURS);
	}

	public long getDay() {
		return getTime(TimeUnit.DAYS);
	}

}
