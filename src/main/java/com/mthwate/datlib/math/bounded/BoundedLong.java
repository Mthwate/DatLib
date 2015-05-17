package com.mthwate.datlib.math.bounded;

/**
 * A long whose value has an upper and lower bound.
 * When performing an operation on this long, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedLong extends BoundedComparable<Long> {
	
	public BoundedLong(Long value, Long min, Long max) {
		super(value, min, max);
	}

	@Override
	public void addLocal(Long n) {
		set(value + n);
	}

	@Override
	public BoundedLong addNew(Long n) {
		return new BoundedLong(value + n, min, max);
	}

	@Override
	public void subtractLocal(Long n) {
		set(value - n);
	}

	@Override
	public BoundedLong subtractNew(Long n) {
		return new BoundedLong(value - n, min, max);
	}

	@Override
	public void multLocal(Long n) {
		set(value * n);
	}

	@Override
	public BoundedLong multNew(Long n) {
		return new BoundedLong(value * n, min, max);
	}

	@Override
	public void divLocal(Long n) {
		set(value / n);
	}

	@Override
	public BoundedLong divNew(Long n) {
		return new BoundedLong(value / n, min, max);
	}
	
}
