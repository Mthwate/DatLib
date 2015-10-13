package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class ShortCalculator implements Calculator<Short> {

	private static final ShortCalculator INSTANCE = new ShortCalculator();

	public static ShortCalculator getInstance() {
		return INSTANCE;
	}

	private ShortCalculator() {}

	@Override
	public Short add(Short n1, Short n2) {
		return (short) (n1 + n2);
	}

	@Override
	public Short subtract(Short n1, Short n2) {
		return (short) (n1 - n2);
	}

	@Override
	public Short multiply(Short n1, Short n2) {
		return (short) (n1 * n2);
	}

	@Override
	public Short divide(Short n1, Short n2) {
		return (short) (n1 / n2);
	}

	@Override
	public Short modulo(Short n1, Short n2) {
		return (short) (n1 % n2);
	}

	@Override
	public Short abs(Short n) {
		return (short) Math.abs(n);
	}

	@Override
	public Short power(Short n1, Short n2) {
		return (short) Math.pow(n1, n2);
	}

	@Override
	public int compare(Short n1, Short n2) {
		return n1.compareTo(n2);
	}

	@Override
	public Short getZero() {
		return 0;
	}

	@Override
	public Short getOne() {
		return 1;
	}

}
