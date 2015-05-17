package com.mthwate.datlib.math.bounded;

/**
 * A float whose value has an upper and lower bound.
 * When performing an operation on this float, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedFloat extends BoundedComparable<Float> {

	public BoundedFloat(Float value, Float min, Float max) {
		super(value, min, max);
	}

	@Override
	public void addLocal(Float n) {
		set(value + n);
	}

	@Override
	public BoundedFloat addNew(Float n) {
		return new BoundedFloat(value + n, min, max);
	}

	@Override
	public void subtractLocal(Float n) {
		set(value - n);
	}

	@Override
	public BoundedFloat subtractNew(Float n) {
		return new BoundedFloat(value - n, min, max);
	}

	@Override
	public void multLocal(Float n) {
		set(value * n);
	}

	@Override
	public BoundedFloat multNew(Float n) {
		return new BoundedFloat(value * n, min, max);
	}

	@Override
	public void divLocal(Float n) {
		set(value / n);
	}

	@Override
	public BoundedFloat divNew(Float n) {
		return new BoundedFloat(value / n, min, max);
	}
	
}
