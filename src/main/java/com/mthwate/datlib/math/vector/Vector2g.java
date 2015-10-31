package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public abstract class Vector2g<S extends Vector2g<S, T>, T> extends VectorNg<S, T> {

	private final T x;

	private final T y;

	public Vector2g(Calculator<T> calculator, T x, T y) {
		super(calculator);
		this.x = x;
		this.y = y;
	}

	protected abstract S getNew(T x, T y);

	public S add(T x, T y) {
		T nx = calculator.add(this.x, x);
		T ny = calculator.add(this.y, y);
		return getNew(nx, ny);
	}

	@Override
	public S add(S vector) {
		return add(vector.getX(), vector.getY());
	}

	@Override
	public S add(T n) {
		return add(n, n);
	}

	public S subtract(T x, T y) {
		T nx = calculator.subtract(this.x, x);
		T ny = calculator.subtract(this.y, y);
		return getNew(nx, ny);
	}

	@Override
	public S subtract(S vector) {
		return subtract(vector.getX(), vector.getY());
	}

	@Override
	public S subtract(T n) {
		return subtract(n, n);
	}

	public S multiply(T x, T y) {
		T nx = calculator.multiply(this.x, x);
		T ny = calculator.multiply(this.y, y);
		return getNew(nx, ny);
	}

	@Override
	public S multiply(S vector) {
		return multiply(vector.getX(), vector.getY());
	}

	@Override
	public S multiply(T n) {
		return multiply(n, n);
	}

	public S divide(T x, T y) {
		T nx = calculator.divide(this.x, x);
		T ny = calculator.divide(this.y, y);
		return getNew(nx, ny);
	}

	@Override
	public S divide(S vector) {
		return divide(vector.getX(), vector.getY());
	}

	@Override
	public S divide(T n) {
		return divide(n, n);
	}

	public T getX() {
		return this.x;
	}

	public T getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		int result = x.hashCode();
		result = 31 * result + y.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Vector3g) {
			Vector3g vector = (Vector3g) obj;
			if (x.equals(vector.getX()) && y.equals(vector.getY())) {
				equals = true;
			}
		}

		return equals;
	}
}