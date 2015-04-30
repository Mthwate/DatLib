package com.mthwate.datlib.math.set;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3i extends Set3g<Set3i, Integer> implements Serializable {

	private static final long serialVersionUID = 5969787431476209188L;

	public Set3i(Integer x, Integer y, Integer z) {
		super(x, y, z);
	}

	public Set3i(Set3i set) {
		super(set);
	}

	@Override
	public void addLocal(Integer x, Integer y, Integer z) {
		_x += x;
		_y += y;
		_z += z;
	}

	@Override
	public Set3i addNew(Integer x, Integer y, Integer z) {
		return new Set3i(_x + x, _y + y, _z + z);
	}

	@Override
	public void subtractLocal(Integer x, Integer y, Integer z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	@Override
	public Set3i subtractNew(Integer x, Integer y, Integer z) {
		return new Set3i(_x - x, _y - y, _z - z);
	}

	@Override
	public void multLocal(Integer x, Integer y, Integer z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	@Override
	public Set3i multNew(Integer x, Integer y, Integer z) {
		return new Set3i(_x * x, _y * y, _z * z);
	}

	@Override
	public void divLocal(Integer x, Integer y, Integer z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	@Override
	public Set3i divNew(Integer x, Integer y, Integer z) {
		return new Set3i(_x * x, _y * y, _z * z);
	}

	@Override
	public Set3i clone() {
		return new Set3i(this);
	}
}
