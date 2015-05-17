package com.mthwate.datlib.math.bounded;

/**
 * An integer whose value has an upper and lower bound.
 * When performing an operation on this integer, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedInteger extends BoundedComparable<Integer> {
	
	public BoundedInteger(Integer value, Integer min, Integer max) {
		super(value, min, max);
	}

	@Override
	public void addLocal(Integer n) {
		set(value + n);
	}

	@Override
	public BoundedInteger addNew(Integer n) {
		return new BoundedInteger(value + n, min, max);
	}

	@Override
	public void subtractLocal(Integer n) {
		set(value - n);
	}

	@Override
	public BoundedInteger subtractNew(Integer n) {
		return new BoundedInteger(value - n, min, max);
	}

	@Override
	public void multLocal(Integer n) {
		set(value * n);
	}

	@Override
	public BoundedInteger multNew(Integer n) {
		return new BoundedInteger(value * n, min, max);
	}

	@Override
	public void divLocal(Integer n) {
		set(value / n);
	}

	@Override
	public BoundedInteger divNew(Integer n) {
		return new BoundedInteger(value / n, min, max);
	}

}
