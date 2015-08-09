package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class Set3g<S extends Set3g<?, T>, T> extends SetNg<S, T> {

	protected T _x;

	protected T _y;

	protected T _z;

	protected final Calculator<T> calculator;

	public Set3g(T x, T y, T z, Calculator<T> calculator) {
		_x = x;
		_y = y;
		_z = z;
		this.calculator = calculator;
	}

	public Set3g(Set3g<S, T> set) {
		this(set.getX(), set.getY(), set.getZ(), set.calculator);
	}

	public void addLocal(T x, T y, T z) {
		_x = calculator.add(_x, x);
		_y = calculator.add(_y, y);
		_z = calculator.add(_z, z);
	}

	@Override
	public void addLocal(S set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void addLocal(T n) {
		addLocal(n, n, n);
	}

	public S addNew(T x, T y, T z) {
		S clone = this.clone();
		clone.addLocal(x, y, z);
		return clone;
	}

	@Override
	public S addNew(S set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S addNew(T n) {
		return addNew(n, n, n);
	}

	public void subtractLocal(T x, T y, T z) {
		_x = calculator.subtract(_x, x);
		_y = calculator.subtract(_y, y);
		_z = calculator.subtract(_z, z);
	}

	@Override
	public void subtractLocal(S set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void subtractLocal(T n) {
		subtractLocal(n, n, n);
	}

	public S subtractNew(T x, T y, T z) {
		S clone = this.clone();
		clone.subtractLocal(x, y, z);
		return clone;
	}

	@Override
	public S subtractNew(S set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S subtractNew(T n) {
		return subtractNew(n, n, n);
	}

	public void multLocal(T x, T y, T z) {
		_x = calculator.multiply(_x, x);
		_y = calculator.multiply(_y, y);
		_z = calculator.multiply(_z, z);
	}

	@Override
	public void multLocal(S set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void multLocal(T n) {
		multLocal(n, n, n);
	}

	public S multNew(T x, T y, T z) {
		S clone = this.clone();
		clone.multLocal(x, y, z);
		return clone;
	}

	@Override
	public S multNew(S set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S multNew(T n) {
		return multNew(n, n, n);
	}

	public void divLocal(T x, T y, T z) {
		_x = calculator.divide(_x, x);
		_y = calculator.divide(_y, y);
		_z = calculator.divide(_z, z);
	}

	@Override
	public void divLocal(S set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void divLocal(T n) {
		divLocal(n, n, n);
	}

	public S divNew(T x, T y, T z) {
		S clone = this.clone();
		clone.divLocal(x, y, z);
		return clone;
	}

	@Override
	public S divNew(S set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S divNew(T n) {
		return divNew(n, n, n);
	}

	public void modLocal(T x, T y, T z) {
		_x = calculator.modulo(_x, x);
		_y = calculator.modulo(_y, y);
		_z = calculator.modulo(_z, z);
	}

	@Override
	public void modLocal(S set) {
		modLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void modLocal(T n) {
		modLocal(n, n, n);
	}

	public S modNew(T x, T y, T z) {
		S clone = this.clone();
		clone.modLocal(x, y, z);
		return clone;
	}

	@Override
	public S modNew(S set) {
		return modNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S modNew(T n) {
		return modNew(n, n, n);
	}

	public T getX() {
		return _x;
	}

	public T getY() {
		return _y;
	}

	public T getZ() {
		return _z;
	}

	@Override
	public int hashCode() {
		int result = _x.hashCode();
		result = 31 * result + _y.hashCode();
		result = 31 * result + _z.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "(" + _x + ", " + _y + ", " + _z + ")";
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set3g) {
			Set3g set = (Set3g) obj;
			if (_x.equals(set.getX()) && _y.equals(set.getY()) && _z.equals(set.getZ())) {
				equals = true;
			}
		}

		return equals;
	}

}