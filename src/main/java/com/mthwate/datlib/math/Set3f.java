package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3f implements Serializable {

	private static final long serialVersionUID = 9080675547546977506L;

	protected float _x;

	protected float _y;

	protected float _z;

	public Set3f(float x, float y, float z) {
		_x = x;
		_y = y;
		_z = z;
	}

	public void addLocal(float x, float y, float z) {
		_x += x;
		_y += y;
		_z += z;
	}

	public void addLocal(Set3f set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	public void addLocal(float i) {
		addLocal(i, i, i);
	}

	public Set3f addNew(float x, float y, float z) {
		return new Set3f(_x + x, _y + y, _z + z);
	}

	public Set3f addNew(Set3f set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3f addNew(float i) {
		return addNew(i, i, i);
	}

	public void subtractLocal(float x, float y, float z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	public void subtractLocal(Set3f set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	public void subtractLocal(float i) {
		subtractLocal(i, i, i);
	}

	public Set3f subtractNew(float x, float y, float z) {
		return new Set3f(_x - x, _y - y, _z - z);
	}

	public Set3f subtractNew(Set3f set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3f subtractNew(float i) {
		return subtractNew(i, i, i);
	}

	public void multLocal(float x, float y, float z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	public void multLocal(Set3f set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	public void multLocal(float i) {
		multLocal(i, i, i);
	}

	public Set3f multNew(float x, float y, float z) {
		return new Set3f(_x * x, _y * y, _z * z);
	}

	public Set3f multNew(Set3f set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3f multNew(float i) {
		return multNew(i, i, i);
	}

	public void divLocal(float x, float y, float z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	public void divLocal(Set3f set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	public void divLocal(float i) {
		divLocal(i, i, i);
	}

	public Set3f divNew(float x, float y, float z) {
		return new Set3f(_x * x, _y * y, _z * z);
	}

	public Set3f divNew(Set3f set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3f divNew(float i) {
		return divNew(i, i, i);
	}

	public float getX() {
		return _x;
	}

	public float getY() {
		return _y;
	}

	public float getZ() {
		return _z;
	}

	@Override
	public int hashCode() {
		int result = (int) _x;
		result = 31 * result + (int) _y;
		result = 31 * result + (int) _z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set3f) {
			Set3f set = (Set3f) obj;
			if (_x == set.getX() && _y == set.getY() && _z == set.getZ()) {
				equals = true;
			}
		}

		return equals;
	}

	@Override
	public String toString() {
		return "(" + _x + ", " + _y + ", " + _z + ")";
	}

	private Set3f plus(Set3f set) {
		return addNew(set);
	}

	private Set3f plus(float i) {
		return addNew(i);
	}

	private Set3f minus(Set3f set) {
		return subtractNew(set);
	}

	private Set3f minus(float i) {
		return subtractNew(i);
	}

	private Set3f multiply(Set3f set) {
		return multNew(set);
	}

	private Set3f multiply(float i) {
		return multNew(i);
	}

	private Set3f div(Set3f set) {
		return divNew(set);
	}

	private Set3f div(float i) {
		return divNew(i);
	}
	
}
