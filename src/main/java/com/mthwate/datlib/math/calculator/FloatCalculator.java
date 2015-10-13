package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class FloatCalculator implements Calculator<Float> {

	private static final FloatCalculator INSTANCE = new FloatCalculator();

	public static FloatCalculator getInstance() {
		return INSTANCE;
	}

	private FloatCalculator() {}

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
	public Float gcd(Float n1, Float n2) {
		throw new UnsupportedOperationException("Cannot calculate the GCD of 2 floats");
	}

	@Override
	public Float lcm(Float n1, Float n2) {
		throw new UnsupportedOperationException("Cannot calculate the LCM of 2 floats");
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
