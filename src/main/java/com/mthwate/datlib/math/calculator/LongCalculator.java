package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public class LongCalculator implements Calculator<Long> {

	@Override
	public Long add(Long n1, Long n2) {
		return n1 + n2;
	}

	@Override
	public Long subtract(Long n1, Long n2) {
		return n1 - n2;
	}

	@Override
	public Long multiply(Long n1, Long n2) {
		return n1 * n2;
	}

	@Override
	public Long divide(Long n1, Long n2) {
		return n1 / n2;
	}

	@Override
	public Long modulo(Long n1, Long n2) {
		return n1 % n2;
	}

	@Override
	public Long abs(Long n) {
		return Math.abs(n);
	}

	@Override
	public Long power(Long n1, Long n2) {
		return (long) Math.pow(n1, n2);
	}

	@Override
	public int compare(Long n1, Long n2) {
		return n1.compareTo(n2);
	}

	@Override
	public Long getZero() {
		return 0L;
	}

	@Override
	public Long getOne() {
		return 1L;
	}

}
