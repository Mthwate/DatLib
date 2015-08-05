package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * A long whose value has an upper and lower bound.
 * When performing an operation on this long, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedLong extends BoundedNumber<BoundedLong, Long> {
	
	public BoundedLong(Long value, Long min, Long max) {
		super(value, min, max, Calculator.LONG_CALCULATOR);
	}

	@Override
	public BoundedLong clone() {
		return new BoundedLong(this.value, this.min, this.max);
	}
}
