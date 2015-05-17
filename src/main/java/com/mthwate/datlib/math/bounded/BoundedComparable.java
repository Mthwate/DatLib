package com.mthwate.datlib.math.bounded;

/**
 * @author mthwate
 * @since 1.1
 */
public abstract class BoundedComparable<T extends Comparable<T>> extends BoundedNumber<T> {

	public BoundedComparable(T value, T min, T max) {
		super(value, min, max);
	}

	@Override
	protected int compare(T n1, T n2) {
		return n1.compareTo(n2);
	}

}
