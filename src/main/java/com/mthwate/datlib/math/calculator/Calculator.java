package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public interface Calculator<T> {

	BigIntegerCalculator BIG_INTEGER_CALCULATOR = BigIntegerCalculator.getInstance();

	ByteCalculator BYTE_CALCULATOR = ByteCalculator.getInstance();

	DoubleCalculator DOUBLE_CALCULATOR = DoubleCalculator.getInstance();

	FloatCalculator FLOAT_CALCULATOR = FloatCalculator.getInstance();

	IntegerCalculator INTEGER_CALCULATOR = IntegerCalculator.getInstance();

	LongCalculator LONG_CALCULATOR = LongCalculator.getInstance();

	ShortCalculator SHORT_CALCULATOR = ShortCalculator.getInstance();



	T add(T n1, T n2);

	T subtract(T n1, T n2);

	T multiply(T n1, T n2);

	T divide(T n1, T n2);

	T modulo(T n1, T n2);

	T abs(T n);

	T power(T n1, T n2);

	T gcd(T n1, T n2);

	T lcm(T n1, T n2);

	int compare(T n1, T n2);

	T getZero();

	T getOne();

}
