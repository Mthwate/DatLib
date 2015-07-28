package com.mthwate.datlib.math.set;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3f extends Set3g<Set3f, Float> implements Serializable {

	private static final long serialVersionUID = 9080675547546977506L;

	public Set3f(Float x, Float y, Float z) {
		super(x, y, z);
	}

	public Set3f(Set3f set) {
		super(set);
	}

	@Override
	public void addLocal(Float x, Float y, Float z) {
		_x += x;
		_y += y;
		_z += z;
	}

	@Override
	public Set3f addNew(Float x, Float y, Float z) {
		return new Set3f(_x + x, _y + y, _z + z);
	}

	@Override
	public void subtractLocal(Float x, Float y, Float z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	@Override
	public Set3f subtractNew(Float x, Float y, Float z) {
		return new Set3f(_x - x, _y - y, _z - z);
	}

	@Override
	public void multLocal(Float x, Float y, Float z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	@Override
	public Set3f multNew(Float x, Float y, Float z) {
		return new Set3f(_x * x, _y * y, _z * z);
	}

	@Override
	public void divLocal(Float x, Float y, Float z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	@Override
	public Set3f divNew(Float x, Float y, Float z) {
		return new Set3f(_x / x, _y / y, _z / z);
	}

	@Override
	public void modLocal(Float x, Float y, Float z) {
		_x %= x;
		_y %= y;
		_z %= z;
	}

	@Override
	public Set3f modNew(Float x, Float y, Float z) {
		return new Set3f(_x % x, _y % y, _z % z);
	}

	@Override
	public Set3f clone() {
		return new Set3f(this);
	}
	
}
