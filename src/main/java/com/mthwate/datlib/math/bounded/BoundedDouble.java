package com.mthwate.datlib.math.bounded;

/**
 * A ndouble whose value has an upper and lower bound.
 * When performing an operation on this double, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedDouble extends BoundedComparable<Double> {

	public BoundedDouble(Double value, Double min, Double max) {
		super(value, min, max);
	}

	@Override
	public void addLocal(Double n) {
		set(value + n);
	}

	@Override
	public BoundedDouble addNew(Double n) {
		return new BoundedDouble(value + n, min, max);
	}

	@Override
	public void subtractLocal(Double n) {
		set(value - n);
	}

	@Override
	public BoundedDouble subtractNew(Double n) {
		return new BoundedDouble(value - n, min, max);
	}

	@Override
	public void multLocal(Double n) {
		set(value * n);
	}

	@Override
	public BoundedDouble multNew(Double n) {
		return new BoundedDouble(value * n, min, max);
	}

	@Override
	public void divLocal(Double n) {
		set(value / n);
	}

	@Override
	public BoundedDouble divNew(Double n) {
		return new BoundedDouble(value / n, min, max);
	}

}