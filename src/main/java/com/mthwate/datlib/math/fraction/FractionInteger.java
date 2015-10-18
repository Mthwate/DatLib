package com.mthwate.datlib.math.fraction;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 */
public class FractionInteger extends Fraction<FractionInteger, Integer> {

	public FractionInteger(Integer numerator, Integer denominator) {
		super(numerator, denominator, Calculator.INTEGER_CALCULATOR);
	}

	@Override
	protected FractionInteger getNew(Integer numerator, Integer denominator) {
		return new FractionInteger(numerator, denominator);
	}

}
