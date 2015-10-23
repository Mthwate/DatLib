package com.mthwate.datlib.math.fraction;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public class FractionInteger extends Fraction<FractionInteger, Integer> {

	public FractionInteger(Integer numerator) {
		super(numerator, 1, Calculator.INTEGER_CALCULATOR);
	}

	public FractionInteger(Integer numerator, Integer denominator) {
		super(numerator, denominator, Calculator.INTEGER_CALCULATOR);
	}

	@Override
	protected FractionInteger getNew(Integer numerator, Integer denominator) {
		return new FractionInteger(numerator, denominator);
	}

}
