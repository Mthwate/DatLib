package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3i implements Serializable {

	private static final long serialVersionUID = 5969787431476209188L;

	protected int _x;

	protected int _y;

	protected int _z;

	public Set3i(int x, int y, int z) {
		_x = x;
		_y = y;
		_z = z;
	}

	public void addLocal(int x, int y, int z) {
		_x += x;
		_y += y;
		_z += z;
	}

	public void addLocal(Set3i set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	public void addLocal(int i) {
		addLocal(i, i, i);
	}

	public Set3i addNew(int x, int y, int z) {
		return new Set3i(_x + x, _y + y, _z + z);
	}

	public Set3i addNew(Set3i set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3i addNew(int i) {
		return addNew(i, i, i);
	}

	public void subtractLocal(int x, int y, int z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	public void subtractLocal(Set3i set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	public void subtractLocal(int i) {
		subtractLocal(i, i, i);
	}

	public Set3i subtractNew(int x, int y, int z) {
		return new Set3i(_x - x, _y - y, _z - z);
	}

	public Set3i subtractNew(Set3i set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3i subtractNew(int i) {
		return subtractNew(i, i, i);
	}

	public void multLocal(int x, int y, int z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	public void multLocal(Set3i set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	public void multLocal(int i) {
		multLocal(i, i, i);
	}

	public Set3i multNew(int x, int y, int z) {
		return new Set3i(_x * x, _y * y, _z * z);
	}

	public Set3i multNew(Set3i set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3i multNew(int i) {
		return multNew(i, i, i);
	}

	public void divLocal(int x, int y, int z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	public void divLocal(Set3i set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	public void divLocal(int i) {
		divLocal(i, i, i);
	}

	public Set3i divNew(int x, int y, int z) {
		return new Set3i(_x * x, _y * y, _z * z);
	}

	public Set3i divNew(Set3i set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3i divNew(int i) {
		return divNew(i, i, i);
	}

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public int getZ() {
		return _z;
	}

	@Override
	public int hashCode() {
		int result = _x;
		result = 31 * result + _y;
		result = 31 * result + _z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set3i) {
			Set3i set = (Set3i) obj;
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

	private Set3i plus(Set3i set) {
		return addNew(set);
	}

	private Set3i plus(int i) {
		return addNew(i);
	}

	private Set3i minus(Set3i set) {
		return subtractNew(set);
	}

	private Set3i minus(int i) {
		return subtractNew(i);
	}

	private Set3i multiply(Set3i set) {
		return multNew(set);
	}

	private Set3i multiply(int i) {
		return multNew(i);
	}

	private Set3i div(Set3i set) {
		return divNew(set);
	}

	private Set3i div(int i) {
		return divNew(i);
	}

}
