package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2f extends Set2g<Set2f, Float> implements Serializable {

	private static final long serialVersionUID = -4566815787927882365L;

	public Set2f(Float x, Float y) {
		super(x, y);
	}

	@Override
	public void addLocal(Float x, Float y) {
		_x += x;
		_y += y;
	}

	@Override
	public Set2f addNew(Float x, Float y) {
		return new Set2f(_x + x, _y + y);
	}

	@Override
	public void subtractLocal(Float x, Float y) {
		_x -= x;
		_y -= y;
	}

	@Override
	public Set2f subtractNew(Float x, Float y) {
		return new Set2f(_x - x, _y - y);
	}

	@Override
	public void multLocal(Float x, Float y) {
		_x *= x;
		_y *= y;
	}

	@Override
	public Set2f multNew(Float x, Float y) {
		return new Set2f(_x * x, _y * y);
	}

	@Override
	public void divLocal(Float x, Float y) {
		_x /= x;
		_y /= y;
	}

	@Override
	public Set2f divNew(Float x, Float y) {
		return new Set2f(_x * x, _y * y);
	}
	
}
