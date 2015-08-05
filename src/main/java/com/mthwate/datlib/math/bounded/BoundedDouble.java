package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;
import com.mthwate.datlib.math.calculator.DoubleCalculator;

/**
 * A double whose value has an upper and lower bound.
 * When performing an operation on this double, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedDouble extends BoundedNumber<BoundedDouble, Double> {

	public BoundedDouble(Double value, Double min, Double max) {
		super(value, min, max, Calculator.DOUBLE_CALCULATOR);
	}

	@Override
	public BoundedDouble clone() {
		return new BoundedDouble(this.value, this.min, this.max);
	}
}