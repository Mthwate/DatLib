package com.mthwate.datlib.math.set;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class Set3g<S extends Set3g<?, T>, T extends Number> extends SetNg<S, T> {

	protected T _x;

	protected T _y;

	protected T _z;

	public Set3g(T x, T y, T z) {
		_x = x;
		_y = y;
		_z = z;
	}

	public Set3g(Set3g<S, T> set) {
		this(set.getX(), set.getY(), set.getZ());
	}

	public abstract void addLocal(T x, T y, T z);

	@Override
	public void addLocal(S set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void addLocal(T n) {
		addLocal(n, n, n);
	}

	public abstract S addNew(T x, T y, T z);

	@Override
	public S addNew(S set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S addNew(T n) {
		return addNew(n, n, n);
	}

	public abstract void subtractLocal(T x, T y, T z);

	@Override
	public void subtractLocal(S set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void subtractLocal(T n) {
		subtractLocal(n, n, n);
	}

	public abstract S subtractNew(T x, T y, T z);

	@Override
	public S subtractNew(S set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S subtractNew(T n) {
		return subtractNew(n, n, n);
	}

	public abstract void multLocal(T x, T y, T z);

	@Override
	public void multLocal(S set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void multLocal(T n) {
		multLocal(n, n, n);
	}

	public abstract S multNew(T x, T y, T z);

	@Override
	public S multNew(S set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S multNew(T n) {
		return multNew(n, n, n);
	}

	public abstract void divLocal(T x, T y, T z);

	@Override
	public void divLocal(S set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public void divLocal(T n) {
		divLocal(n, n, n);
	}

	public abstract S divNew(T x, T y, T z);

	@Override
	public S divNew(S set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	@Override
	public S divNew(T n) {
		return divNew(n, n, n);
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
		int result = _x.intValue();
		result = 31 * result + _y.intValue();
		result = 31 * result + _z.intValue();
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