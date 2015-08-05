package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * An integer whose value has an upper and lower bound.
 * When performing an operation on this integer, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedInteger extends BoundedNumber<BoundedInteger, Integer> {
	
	public BoundedInteger(Integer value, Integer min, Integer max) {
		super(value, min, max, Calculator.INTEGER_CALCULATOR);
	}

	@Override
	public BoundedInteger clone() {
		return new BoundedInteger(this.value, this.min, this.max);
	}
}
