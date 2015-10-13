package com.mthwate.datlib.math.calculator;

import java.math.BigInteger;

/**
 * @author mthwate
 */
public class BigIntegerCalculator implements Calculator<BigInteger> {

	private static final BigIntegerCalculator INSTANCE = new BigIntegerCalculator();

	public static BigIntegerCalculator getInstance() {
		return INSTANCE;
	}

	private BigIntegerCalculator() {}

	@Override
	public BigInteger add(BigInteger n1, BigInteger n2) {
		return n1.add(n2);
	}

	@Override
	public BigInteger subtract(BigInteger n1, BigInteger n2) {
		return n1.subtract(n2);
	}

	@Override
	public BigInteger multiply(BigInteger n1, BigInteger n2) {
		return n1.multiply(n2);
	}

	@Override
	public BigInteger divide(BigInteger n1, BigInteger n2) {
		return n1.divide(n2);
	}

	@Override
	public BigInteger modulo(BigInteger n1, BigInteger n2) {
		return n1.mod(n2);
	}

	@Override
	public BigInteger abs(BigInteger n) {
		return n.abs();
	}

	@Override
	public BigInteger power(BigInteger n1, BigInteger n2) {
		return n1.pow(n2.intValue());
	}

	@Override
	public int compare(BigInteger n1, BigInteger n2) {
		return n1.compareTo(n2);
	}

	@Override
	public BigInteger getZero() {
		return BigInteger.ZERO;
	}

	@Override
	public BigInteger getOne() {
		return BigInteger.ONE;
	}

}
