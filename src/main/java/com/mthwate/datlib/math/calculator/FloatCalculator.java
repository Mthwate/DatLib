package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class FloatCalculator implements Calculator<Float> {

	@Override
	public Float add(Float n1, Float n2) {
		return n1 + n2;
	}

	@Override
	public Float subtract(Float n1, Float n2) {
		return n1 - n2;
	}

	@Override
	public Float multiply(Float n1, Float n2) {
		return n1 * n2;
	}

	@Override
	public Float divide(Float n1, Float n2) {
		return n1 / n2;
	}

	@Override
	public Float modulo(Float n1, Float n2) {
		return n1 % n2;
	}

	@Override
	public Float abs(Float n) {
		return Math.abs(n);
	}

	@Override
	public Float power(Float n1, Float n2) {
		return (float) Math.pow(n1, n2);
	}

	@Override
	public int compare(Float n1, Float n2) {
		return n1.compareTo(n2);
	}

	@Override
	public Float getZero() {
		return 0F;
	}

	@Override
	public Float getOne() {
		return 1F;
	}

}
