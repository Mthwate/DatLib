package com.mthwate.datlib.math.vector;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.3
 */
public abstract class Vector3g<S extends Vector3g<S, T>, T> extends VectorNg<S, T> {

	private final T x;

	private final T y;

	private final T z;

	public Vector3g(Calculator<T> calculator, T x, T y, T z) {
		super(calculator);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	protected abstract S getNew(T x, T y, T z);

	public S add(T x, T y, T z) {
		T nx = calculator.add(this.x, x);
		T ny = calculator.add(this.y, y);
		T nz = calculator.add(this.z, z);
		return getNew(nx, ny, nz);
	}

	@Override
	public S add(S vector) {
		return add(vector.getX(), vector.getY(), vector.getZ());
	}

	@Override
	public S add(T n) {
		return add(n, n, n);
	}

	public S subtract(T x, T y, T z) {
		T nx = calculator.subtract(this.x, x);
		T ny = calculator.subtract(this.y, y);
		T nz = calculator.subtract(this.z, z);
		return getNew(nx, ny, nz);
	}

	@Override
	public S subtract(S vector) {
		return subtract(vector.getX(), vector.getY(), vector.getZ());
	}

	@Override
	public S subtract(T n) {
		return subtract(n, n, n);
	}

	public S multiply(T x, T y, T z) {
		T nx = calculator.multiply(this.x, x);
		T ny = calculator.multiply(this.y, y);
		T nz = calculator.multiply(this.z, z);
		return getNew(nx, ny, nz);
	}

	@Override
	public S multiply(S vector) {
		return multiply(vector.getX(), vector.getY(), vector.getZ());
	}

	@Override
	public S multiply(T n) {
		return multiply(n, n, n);
	}

	public S divide(T x, T y, T z) {
		T nx = calculator.divide(this.x, x);
		T ny = calculator.divide(this.y, y);
		T nz = calculator.divide(this.z, z);
		return getNew(nx, ny, nz);
	}

	@Override
	public S divide(S vector) {
		return divide(vector.getX(), vector.getY(), vector.getZ());
	}

	@Override
	public S divide(T n) {
		return divide(n, n, n);
	}

	public T getX() {
		return this.x;
	}

	public T getY() {
		return this.y;
	}

	public T getZ() {
		return this.z;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public int hashCode() {
		int result = x.hashCode();
		result = 31 * result + y.hashCode();
		result = 31 * result + z.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Vector3g) {
			Vector3g vector = (Vector3g) obj;
			if (x.equals(vector.getX()) && y.equals(vector.getY()) && z.equals(vector.getZ())) {
				equals = true;
			}
		}

		return equals;
	}
}
