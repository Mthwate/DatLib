package com.mthwate.datlib.math.set;

import com.mthwate.datlib.math.calculator.Calculator;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class Set2g<S extends Set2g<?, T>, T> extends SetNg<S, T> {

	protected T _x;

	protected T _y;

	protected final transient Calculator<T> calculator;

	public Set2g(T x, T y, Calculator<T> calculator) {
		_x = x;
		_y = y;
		this.calculator = calculator;
	}

	public Set2g(Set2g<S, T> set) {
		this(set.getX(), set.getY(), set.calculator);
	}

	public void addLocal(T x, T y) {
		_x = calculator.add(_x, x);
		_y = calculator.add(_y, y);
	}
	
	@Override
	public void addLocal(S set) {
		addLocal(set.getX(), set.getY());
	}

	@Override
	public void addLocal(T n) {
		addLocal(n, n);
	}

	public S addNew(T x, T y) {
		S clone = this.clone();
		clone.addLocal(x, y);
		return clone;
	}

	@Override
	public S addNew(S set) {
		return addNew(set.getX(), set.getY());
	}

	@Override
	public S addNew(T n) {
		return addNew(n, n);
	}

	public void subtractLocal(T x, T y) {
		_x = calculator.subtract(_x, x);
		_y = calculator.subtract(_y, y);
	}

	@Override
	public void subtractLocal(S set) {
		subtractLocal(set.getX(), set.getY());
	}

	@Override
	public void subtractLocal(T n) {
		subtractLocal(n, n);
	}

	public S subtractNew(T x, T y) {
		S clone = this.clone();
		clone.subtractLocal(x, y);
		return clone;
	}

	@Override
	public S subtractNew(S set) {
		return subtractNew(set.getX(), set.getY());
	}

	@Override
	public S subtractNew(T n) {
		return subtractNew(n, n);
	}

	public void multLocal(T x, T y) {
		_x = calculator.multiply(_x, x);
		_y = calculator.multiply(_y, y);
	}

	@Override
	public void multLocal(S set) {
		multLocal(set.getX(), set.getY());
	}

	@Override
	public void multLocal(T n) {
		multLocal(n, n);
	}

	public S multNew(T x, T y) {
		S clone = this.clone();
		clone.multLocal(x, y);
		return clone;
	}

	@Override
	public S multNew(S set) {
		return multNew(set.getX(), set.getY());
	}

	@Override
	public S multNew(T n) {
		return multNew(n, n);
	}

	public void divLocal(T x, T y) {
		_x = calculator.divide(_x, x);
		_y = calculator.divide(_y, y);
	}

	@Override
	public void divLocal(S set) {
		divLocal(set.getX(), set.getY());
	}

	@Override
	public void divLocal(T n) {
		divLocal(n, n);
	}

	public S divNew(T x, T y) {
		S clone = this.clone();
		clone.divLocal(x, y);
		return clone;
	}

	@Override
	public S divNew(S set) {
		return divNew(set.getX(), set.getY());
	}

	@Override
	public S divNew(T n) {
		return divNew(n, n);
	}

	public void modLocal(T x, T y) {
		_x = calculator.modulo(_x, x);
		_y = calculator.modulo(_y, y);
	}

	@Override
	public void modLocal(S set) {
		modLocal(set.getX(), set.getY());
	}

	@Override
	public void modLocal(T n) {
		modLocal(n, n);
	}

	public S modNew(T x, T y) {
		S clone = this.clone();
		clone.modLocal(x, y);
		return clone;
	}

	@Override
	public S modNew(S set) {
		return modNew(set.getX(), set.getY());
	}

	@Override
	public S modNew(T n) {
		return modNew(n, n);
	}

	public T getX() {
		return _x;
	}

	public T getY() {
		return _y;
	}

	@Override
	public int hashCode() {
		int result = _x.hashCode();
		result = 31 * result + _y.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "(" + _x + ", " + _y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set2g) {
			Set2g set = (Set2g) obj;
			if (_x.equals(set.getX()) && _y.equals(set.getY())) {
				equals = true;
			}
		}

		return equals;
	}
	
}
