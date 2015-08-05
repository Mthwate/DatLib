package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public abstract class LoopingNumber<S extends LoopingNumber, T> extends BaseBounded<S, T> {

	protected final T inclusive;

	protected final T exclusive;

	protected final T min;

	protected final T max;

	public LoopingNumber(T value, T inclusiveBound, T exclusiveBound, Calculator<T> calculator) {
		super(calculator);

		if (value == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}

		if (inclusiveBound == null) {
			throw new IllegalArgumentException("Inclusive bound cannot be null");
		}

		if (exclusiveBound == null) {
			throw new IllegalArgumentException("Exclusive bound cannot be null");
		}

		if (inclusiveBound.equals(exclusiveBound)) {
			throw new IllegalArgumentException("Bounds must be different");
		}

		this.inclusive = inclusiveBound;
		this.exclusive = exclusiveBound;

		if (calculator.compare(inclusiveBound, exclusiveBound) > 0) {
			this.min = exclusiveBound;
			this.max = inclusiveBound;
		} else {
			this.min = inclusiveBound;
			this.max = exclusiveBound;
		}

		set(value);
	}

	public T getValue() {
		return value;
	}

	@Override
	public void set(T n) {
		value = boundLower(boundUpper(n));
		if (value == exclusive) {
			value = inclusive;
		}
	}

	protected T boundLower(T n) {
		T i = n;

		while (calculator.compare(min, i) > 0) {
			T diff = calculator.subtract(min, i);
			i = max;
			i = calculator.subtract(i, diff);
		}

		return i;
	}

	protected T boundUpper(T n) {
		T i = n;

		while (calculator.compare(max, i) < 0) {
			T diff = calculator.subtract(i, max);
			i = min;
			i = calculator.add(i, diff);
		}

		return i;
	}

}
