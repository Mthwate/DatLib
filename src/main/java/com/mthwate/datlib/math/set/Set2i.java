package com.mthwate.datlib.math.set;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2i extends Set2g<Set2i, Integer> implements Serializable {

	private static final long serialVersionUID = 3039497236768820386L;

	public Set2i(int x, int y) {
		super(x, y);
	}

	public Set2i(Set2i set) {
		super(set);
	}

	@Override
	public void addLocal(Integer x, Integer y) {
		_x += x;
		_y += y;
	}

	@Override
	public Set2i addNew(Integer x, Integer y) {
		return new Set2i(_x + x, _y + y);
	}

	@Override
	public void subtractLocal(Integer x, Integer y) {
		_x -= x;
		_y -= y;
	}

	@Override
	public Set2i subtractNew(Integer x, Integer y) {
		return new Set2i(_x - x, _y - y);
	}

	@Override
	public void multLocal(Integer x, Integer y) {
		_x *= x;
		_y *= y;
	}

	@Override
	public Set2i multNew(Integer x, Integer y) {
		return new Set2i(_x * x, _y * y);
	}

	@Override
	public void divLocal(Integer x, Integer y) {
		_x /= x;
		_y /= y;
	}

	@Override
	public Set2i divNew(Integer x, Integer y) {
		return new Set2i(_x / x, _y / y);
	}

	@Override
	public void modLocal(Integer x, Integer y) {
		_x %= x;
		_y %= y;
	}

	@Override
	public Set2i modNew(Integer x, Integer y) {
		return new Set2i(_x % x, _y % y);
	}

	@Override
	public Set2i clone() {
		return new Set2i(this);
	}
	
}
