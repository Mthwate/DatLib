package com.mthwate.datlib.math.bounded;

/**
 * A number whose value has an upper and lower bound.
 * When performing an operation on this number, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public abstract class BoundedNumber<T> implements Cloneable {

	protected T value;

	protected final T min;

	protected final T max;

	public BoundedNumber(T value, T min, T max) {
		this.min = min;
		this.max = max;
		set(value);
	}

	public T getValue() {
		return value;
	}

	public void set(T n) {
		value = boundLower(boundUpper(n));
	}

	protected T boundLower(T n) {
		T i = n;

		if (min != null && compare(min, i) > 0) {
			i = min;
		}

		return i;
	}

	protected T boundUpper(T n) {
		T i = n;

		if (max != null && compare(max, i) < 0) {
			i = max;
		}

		return i;
	}

	/**
	 * Compares 2 numbers.
	 *
	 * @param n1 the first number to compare
	 * @param n2 the second number to compare
	 * @return a negative number if n1 &lt; n2, a positive number if n1 &gt; n2, and 0 if n1 = n2
	 */
	protected abstract int compare(T n1, T n2);

	public abstract void addLocal(T n);

	public abstract BoundedNumber<T> addNew(T n);

	public abstract void subtractLocal(T n);

	public abstract BoundedNumber<T> subtractNew(T n);

	public abstract void multLocal(T n);

	public abstract BoundedNumber<T> multNew(T n);

	public abstract void divLocal(T n);

	public abstract BoundedNumber<T> divNew(T n);

}
