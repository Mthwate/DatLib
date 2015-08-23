package com.mthwate.datlib.math.bounded;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.2
 */
public abstract class BaseBounded<S extends BaseBounded<S, T>, T> implements Cloneable {

	protected T value;

	protected final Calculator<T> calculator;

	public BaseBounded(Calculator<T> calculator) {
		if (calculator == null) {
			throw new IllegalArgumentException("Calculator cannot be null");
		}

		this.calculator = calculator;
	}

	public abstract void set(T n);

	public void addLocal(T n) {
		set(calculator.add(value, n));
	}

	public S addNew(T n) {
		S nu = this.clone();
		nu.addLocal(n);
		return nu;
	}

	public void subtractLocal(T n) {
		set(calculator.subtract(value, n));
	}

	public S subtractNew(T n) {
		S nu = this.clone();
		nu.subtractLocal(n);
		return nu;
	}

	public void multLocal(T n) {
		set(calculator.multiply(value, n));
	}

	public S multNew(T n) {
		S nu = this.clone();
		nu.multLocal(n);
		return nu;
	}

	public void divLocal(T n) {
		set(calculator.divide(value, n));
	}

	public S divNew(T n) {
		S nu = this.clone();
		nu.divLocal(n);
		return nu;
	}

	public void modLocal(T n) {
		set(calculator.modulo(value, n));
	}

	public S modNew(T n) {
		S nu = this.clone();
		nu.modLocal(n);
		return nu;
	}

	public void powLocal(T n) {
		set(calculator.power(value, n));
	}

	public S powNew(T n) {
		S nu = this.clone();
		nu.powLocal(n);
		return nu;
	}

	@Override
	public abstract S clone();

}
