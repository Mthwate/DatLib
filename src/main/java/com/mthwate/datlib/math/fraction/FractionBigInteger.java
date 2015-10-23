package com.mthwate.datlib.math.fraction;

import com.mthwate.datlib.math.calculator.Calculator;

import java.math.BigInteger;

/**
 * @author mthwate
 * @since 1.3
 */
public class FractionBigInteger extends Fraction<FractionBigInteger, BigInteger> {

	public FractionBigInteger(BigInteger numerator) {
		super(numerator, BigInteger.ONE, Calculator.BIG_INTEGER_CALCULATOR);
	}

	public FractionBigInteger(BigInteger numerator, BigInteger denominator) {
		super(numerator, denominator, Calculator.BIG_INTEGER_CALCULATOR);
	}

	@Override
	protected FractionBigInteger getNew(BigInteger numerator, BigInteger denominator) {
		return new FractionBigInteger(numerator, denominator);
	}

}
