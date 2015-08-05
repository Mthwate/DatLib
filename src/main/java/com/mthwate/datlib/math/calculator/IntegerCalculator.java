package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class IntegerCalculator implements Calculator<Integer> {

	@Override
	public Integer add(Integer n1, Integer n2) {
		return n1 + n2;
	}

	@Override
	public Integer subtract(Integer n1, Integer n2) {
		return n1 - n2;
	}

	@Override
	public Integer multiply(Integer n1, Integer n2) {
		return n1 * n2;
	}

	@Override
	public Integer divide(Integer n1, Integer n2) {
		return n1 / n2;
	}

	@Override
	public Integer modulo(Integer n1, Integer n2) {
		return n1 % n2;
	}

	@Override
	public Integer abs(Integer n) {
		return Math.abs(n);
	}

	@Override
	public Integer power(Integer n1, Integer n2) {
		return (int) Math.pow(n1, n2);
	}

	@Override
	public int compare(Integer n1, Integer n2) {
		return n1.compareTo(n2);
	}

}
