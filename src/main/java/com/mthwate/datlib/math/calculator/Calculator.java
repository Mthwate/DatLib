package com.mthwate.datlib.math.calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public interface Calculator<T> {

	BigIntegerCalculator BIG_INTEGER_CALCULATOR = new BigIntegerCalculator();

	ByteCalculator BYTE_CALCULATOR = new ByteCalculator();

	DoubleCalculator DOUBLE_CALCULATOR = new DoubleCalculator();

	FloatCalculator FLOAT_CALCULATOR = new FloatCalculator();

	IntegerCalculator INTEGER_CALCULATOR = new IntegerCalculator();

	LongCalculator LONG_CALCULATOR = new LongCalculator();

	ShortCalculator SHORT_CALCULATOR = new ShortCalculator();



	T add(T n1, T n2);

	T subtract(T n1, T n2);

	T multiply(T n1, T n2);

	T divide(T n1, T n2);

	T modulo(T n1, T n2);

	T abs(T n);

	T power(T n1, T n2);

	int compare(T n1, T n2);

	T getZero();

	T getOne();

}
