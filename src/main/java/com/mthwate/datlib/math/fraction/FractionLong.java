package com.mthwate.datlib.math.fraction;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 */
public class FractionLong extends Fraction<FractionLong, Long> {

	public FractionLong(Long numerator, Long denominator) {
		super(numerator, denominator, Calculator.LONG_CALCULATOR);
	}

	@Override
	protected FractionLong getNew(Long numerator, Long denominator) {
		return new FractionLong(numerator, denominator);
	}
}
