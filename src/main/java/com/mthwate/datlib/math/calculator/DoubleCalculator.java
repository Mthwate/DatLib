package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class DoubleCalculator implements Calculator<Double> {

	private static final DoubleCalculator INSTANCE = new DoubleCalculator();

	public static DoubleCalculator getInstance() {
		return INSTANCE;
	}

	private DoubleCalculator() {}

	@Override
	public Double add(Double n1, Double n2) {
		return n1 + n2;
	}

	@Override
	public Double subtract(Double n1, Double n2) {
		return n1 - n2;
	}

	@Override
	public Double multiply(Double n1, Double n2) {
		return n1 * n2;
	}

	@Override
	public Double divide(Double n1, Double n2) {
		return n1 / n2;
	}

	@Override
	public Double modulo(Double n1, Double n2) {
		return n1 % n2;
	}

	@Override
	public Double abs(Double n) {
		return Math.abs(n);
	}

	@Override
	public Double power(Double n1, Double n2) {
		return Math.pow(n1, n2);
	}

	@Override
	public Double gcd(Double n1, Double n2) {
		throw new UnsupportedOperationException("Cannot calculate the GCD of 2 doubles");
	}

	@Override
	public Double lcm(Double n1, Double n2) {
		throw new UnsupportedOperationException("Cannot calculate the LCM of 2 doubles");
	}

	@Override
	public int compare(Double n1, Double n2) {
		return n1.compareTo(n2);
	}

	@Override
	public Double getZero() {
		return 0D;
	}

	@Override
	public Double getOne() {
		return 1D;
	}

}
