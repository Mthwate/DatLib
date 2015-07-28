package com.mthwate.datlib.math.set;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3d extends Set3g<Set3d, Double> implements Serializable {

	private static final long serialVersionUID = 9160974412909509546L;

	public Set3d(Double x, Double y, Double z) {
		super(x, y, z);
	}

	public Set3d(Set3d set) {
		super(set);
	}

	@Override
	public void addLocal(Double x, Double y, Double z) {
		_x += x;
		_y += y;
		_z += z;
	}

	@Override
	public Set3d addNew(Double x, Double y, Double z) {
		return new Set3d(_x + x, _y + y, _z + z);
	}

	@Override
	public void subtractLocal(Double x, Double y, Double z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	@Override
	public Set3d subtractNew(Double x, Double y, Double z) {
		return new Set3d(_x - x, _y - y, _z - z);
	}

	@Override
	public void multLocal(Double x, Double y, Double z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	@Override
	public Set3d multNew(Double x, Double y, Double z) {
		return new Set3d(_x * x, _y * y, _z * z);
	}

	@Override
	public void divLocal(Double x, Double y, Double z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	@Override
	public Set3d divNew(Double x, Double y, Double z) {
		return new Set3d(_x / x, _y / y, _z / z);
	}

	@Override
	public Set3d clone() {
		return new Set3d(this);
	}
	
}
