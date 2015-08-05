package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * A number whose value has an upper and lower bound.
 * When performing an operation on this number, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public abstract class BoundedNumber<S extends BoundedNumber, T> extends BaseBounded<S, T> {

	protected final T min;

	protected final T max;

	public BoundedNumber(T value, T min, T max, Calculator<T> calculator) {
		super(calculator);

		if (value == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}

		if (min != null && max != null && calculator.compare(min, max) > 0) {
			throw new IllegalArgumentException("Min cannot be greater than max");
		}

		this.min = min;
		this.max = max;
		set(value);
	}

	public T getValue() {
		return value;
	}

	@Override
	public void set(T n) {
		value = boundLower(boundUpper(n));
	}

	protected T boundLower(T n) {
		T i = n;

		if (min != null && calculator.compare(min, i) > 0) {
			i = min;
		}

		return i;
	}

	protected T boundUpper(T n) {
		T i = n;

		if (max != null && calculator.compare(max, i) < 0) {
			i = max;
		}

		return i;
	}

}
