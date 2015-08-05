package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;
import com.mthwate.datlib.math.calculator.FloatCalculator;

/**
 * A float whose value has an upper and lower bound.
 * When performing an operation on this float, if the value would normally exceed these bounds, it only reaches them.
 * For example, the number 0 bounded by -5 and 5 would have a value of 5 when 10 was added to it.
 *
 * @author mthwate
 * @since 1.1
 */
public class BoundedFloat extends BoundedNumber<BoundedFloat, Float> {

	public BoundedFloat(Float value, Float min, Float max) {
		super(value, min, max, Calculator.FLOAT_CALCULATOR);
	}

	@Override
	public BoundedFloat clone() {
		return new BoundedFloat(this.value, this.min, this.max);
	}
}
