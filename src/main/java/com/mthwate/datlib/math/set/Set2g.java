package com.mthwate.datlib.math.set;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class Set2g<S extends Set2g<?, T>, T> extends SetNg<S, T> {

	protected T _x;

	protected T _y;

	public Set2g(T x, T y) {
		_x = x;
		_y = y;
	}

	public Set2g(Set2g<S, T> set) {
		this(set.getX(), set.getY());
	}

	public abstract void addLocal(T x, T y);
	
	@Override
	public void addLocal(S set) {
		addLocal(set.getX(), set.getY());
	}

	@Override
	public void addLocal(T n) {
		addLocal(n, n);
	}

	public abstract S addNew(T x, T y);

	@Override
	public S addNew(S set) {
		return addNew(set.getX(), set.getY());
	}

	@Override
	public S addNew(T n) {
		return addNew(n, n);
	}

	public abstract void subtractLocal(T x, T y);

	@Override
	public void subtractLocal(S set) {
		subtractLocal(set.getX(), set.getY());
	}

	@Override
	public void subtractLocal(T n) {
		subtractLocal(n, n);
	}

	public abstract S subtractNew(T x, T y);

	@Override
	public S subtractNew(S set) {
		return subtractNew(set.getX(), set.getY());
	}

	@Override
	public S subtractNew(T n) {
		return subtractNew(n, n);
	}

	public abstract void multLocal(T x, T y);

	@Override
	public void multLocal(S set) {
		multLocal(set.getX(), set.getY());
	}

	@Override
	public void multLocal(T n) {
		multLocal(n, n);
	}

	public abstract S multNew(T x, T y);

	@Override
	public S multNew(S set) {
		return multNew(set.getX(), set.getY());
	}

	@Override
	public S multNew(T n) {
		return multNew(n, n);
	}

	public abstract void divLocal(T x, T y);

	@Override
	public void divLocal(S set) {
		divLocal(set.getX(), set.getY());
	}

	@Override
	public void divLocal(T n) {
		divLocal(n, n);
	}

	public abstract S divNew(T x, T y);

	@Override
	public S divNew(S set) {
		return divNew(set.getX(), set.getY());
	}

	@Override
	public S divNew(T n) {
		return divNew(n, n);
	}

	public abstract void modLocal(T x, T y);

	@Override
	public void modLocal(S set) {
		modLocal(set.getX(), set.getY());
	}

	@Override
	public void modLocal(T n) {
		modLocal(n, n);
	}

	public abstract S modNew(T x, T y);

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
