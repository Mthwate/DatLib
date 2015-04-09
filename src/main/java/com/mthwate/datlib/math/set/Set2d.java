package com.mthwate.datlib.math.set;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2d extends Set2g<Set2d, Double> implements Serializable {

	private static final long serialVersionUID = 7545185431305740320L;

	public Set2d(Double x, Double y) {
		super(x, y);
	}

	@Override
	public void addLocal(Double x, Double y) {
		_x += x;
		_y += y;
	}

	@Override
	public Set2d addNew(Double x, Double y) {
		return new Set2d(_x + x, _y + y);
	}

	@Override
	public void subtractLocal(Double x, Double y) {
		_x -= x;
		_y -= y;
	}

	@Override
	public Set2d subtractNew(Double x, Double y) {
		return new Set2d(_x - x, _y - y);
	}

	@Override
	public void multLocal(Double x, Double y) {
		_x *= x;
		_y *= y;
	}

	@Override
	public Set2d multNew(Double x, Double y) {
		return new Set2d(_x * x, _y * y);
	}

	@Override
	public void divLocal(Double x, Double y) {
		_x /= x;
		_y /= y;
	}

	@Override
	public Set2d divNew(Double x, Double y) {
		return new Set2d(_x * x, _y * y);
	}
	
}
