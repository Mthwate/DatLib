package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3d implements Serializable {

	private static final long serialVersionUID = 9160974412909509546L;

	protected double _x;

	protected double _y;

	protected double _z;

	public Set3d(double x, double y, double z) {
		_x = x;
		_y = y;
		_z = z;
	}

	public void addLocal(double x, double y, double z) {
		_x += x;
		_y += y;
		_z += z;
	}

	public void addLocal(Set3d set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	public void addLocal(double i) {
		addLocal(i, i, i);
	}

	public Set3d addNew(double x, double y, double z) {
		return new Set3d(_x + x, _y + y, _z + z);
	}

	public Set3d addNew(Set3d set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3d addNew(double i) {
		return addNew(i, i, i);
	}

	public void subtractLocal(double x, double y, double z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	public void subtractLocal(Set3d set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	public void subtractLocal(double i) {
		subtractLocal(i, i, i);
	}

	public Set3d subtractNew(double x, double y, double z) {
		return new Set3d(_x - x, _y - y, _z - z);
	}

	public Set3d subtractNew(Set3d set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3d subtractNew(double i) {
		return subtractNew(i, i, i);
	}

	public void multLocal(double x, double y, double z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	public void multLocal(Set3d set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	public void multLocal(double i) {
		multLocal(i, i, i);
	}

	public Set3d multNew(double x, double y, double z) {
		return new Set3d(_x * x, _y * y, _z * z);
	}

	public Set3d multNew(Set3d set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3d multNew(double i) {
		return multNew(i, i, i);
	}

	public void divLocal(double x, double y, double z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	public void divLocal(Set3d set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	public void divLocal(double i) {
		divLocal(i, i, i);
	}

	public Set3d divNew(double x, double y, double z) {
		return new Set3d(_x * x, _y * y, _z * z);
	}

	public Set3d divNew(Set3d set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3d divNew(double i) {
		return divNew(i, i, i);
	}

	public double getX() {
		return _x;
	}

	public double getY() {
		return _y;
	}

	public double getZ() {
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

		if (obj instanceof Set3d) {
			Set3d set = (Set3d) obj;
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

	/**
	 * A groovy operator overloading method to add all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to add to the current set
	 * @return the new set
	 */
	private Set3d plus(Set3d set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param d the number to add to the set
	 * @return the new set
	 */
	private Set3d plus(double d) {
		return addNew(d);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private Set3d minus(Set3d set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param d the number to subtract from the set
	 * @return the new set
	 */
	private Set3d minus(double d) {
		return subtractNew(d);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private Set3d multiply(Set3d set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param d the number to multiply the set by
	 * @return the new set
	 */
	private Set3d multiply(double d) {
		return multNew(d);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private Set3d div(Set3d set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param d the number to divide the set by
	 * @return the new set
	 */
	private Set3d div(double d) {
		return divNew(d);
	}
	
}
