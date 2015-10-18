package com.mthwate.datlib.math.fraction;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 */
public abstract class Fraction<S extends Fraction<?, T>, T> implements Comparable<S> {

	private final T numerator;

	private final T denominator;

	private final Calculator<T> calculator;

	public Fraction(T numerator, T denominator, Calculator<T> calculator) {

		this.calculator = calculator;

		if (denominator.equals(calculator.getZero())) {
			throw new IllegalArgumentException("Denominator cannot be 0");
		}

		T gcd = calculator.gcd(numerator, denominator);

		T mod = calculator.compare(denominator, calculator.getZero()) > 0 ? calculator.getOne() : calculator.subtract(calculator.getZero(), calculator.getOne());

		this.numerator = calculator.multiply(calculator.divide(numerator, gcd), mod);
		this.denominator = calculator.multiply(calculator.divide(denominator, gcd), mod);
	}

	protected abstract S getNew(T numerator, T denominator);

	public T getNumerator() {
		return numerator;
	}

	public T getDenominator() {
		return denominator;
	}

	public S add(S fraction) {
		T lcm = calculator.lcm(this.denominator, fraction.getDenominator());

		T numerator1 = calculator.divide(calculator.multiply(this.numerator, lcm), this.denominator);
		T numerator2 = calculator.divide(calculator.multiply(fraction.getNumerator(), lcm), fraction.getDenominator());

		return getNew(calculator.add(numerator1, numerator2), lcm);
	}

	public S add(T number) {
		return add(getNew(number, calculator.getOne()));
	}

	public S subtract(S fraction) {
		T lcm = calculator.lcm(this.denominator, fraction.getDenominator());

		T numerator1 = calculator.divide(calculator.multiply(this.numerator, lcm), this.denominator);
		T numerator2 = calculator.divide(calculator.multiply(fraction.getNumerator(), lcm), fraction.getDenominator());

		return getNew(calculator.subtract(numerator1, numerator2), lcm);
	}

	public S subtract(T number) {
		return subtract(getNew(number, calculator.getOne()));
	}

	public S multiply(S fraction) {
		return getNew(calculator.multiply(this.numerator, fraction.getNumerator()), calculator.multiply(this.denominator, fraction.getDenominator()));
	}

	public S multiply(T number) {
		return multiply(getNew(number, calculator.getOne()));
	}

	public S divide(S fraction) {
		return getNew(calculator.multiply(this.numerator, fraction.getDenominator()), calculator.multiply(this.denominator, fraction.getNumerator()));
	}

	public S divide(T number) {
		return divide(getNew(number, calculator.getOne()));
	}

	@Override
	public int compareTo(S fraction) {
		T lcm = calculator.lcm(this.denominator, fraction.getDenominator());

		T numerator1 = calculator.divide(calculator.multiply(this.numerator, lcm), this.denominator);
		T numerator2 = calculator.divide(calculator.multiply(fraction.getNumerator(), lcm), fraction.getDenominator());

		return calculator.compare(numerator1, numerator2);
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Fraction) {
			Fraction fraction = (Fraction) obj;
			equals = this.numerator.equals(fraction.numerator) && this.denominator.equals(fraction.denominator);
		}

		return equals;
	}

	@Override
	public String toString() {
		String str;

		if (denominator.equals(calculator.getOne())) {
			str = String.valueOf(numerator);
		} else {
			str = numerator + "/" + denominator;
		}

		return str;
	}

}
