package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public abstract class VectorNg<S extends VectorNg, T> {

	protected transient final Calculator<T> calculator;

	public VectorNg(Calculator<T> calculator) {
		this.calculator = calculator;
	}

	public abstract S add(S vector);

	public abstract S add(T n);

	public abstract S subtract(S vector);

	public abstract S subtract(T n);

	public abstract S multiply(S vector);

	public abstract S multiply(T n);

	public abstract S divide(S vector);

	public abstract S divide(T n);

}
