package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set3s implements Serializable {

	private static final long serialVersionUID = -4674797060929053331L;

	protected short _x;

	protected short _y;

	protected short _z;

	public Set3s(short x, short y, short z) {
		_x = x;
		_y = y;
		_z = z;
	}

	public void addLocal(short x, short y, short z) {
		_x += x;
		_y += y;
		_z += z;
	}

	public void addLocal(Set3s set) {
		addLocal(set.getX(), set.getY(), set.getZ());
	}

	public void addLocal(short i) {
		addLocal(i, i, i);
	}

	public Set3s addNew(short x, short y, short z) {
		return new Set3s((short) (_x + x), (short) (_y + y), (short) (_z + z));
	}

	public Set3s addNew(Set3s set) {
		return addNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3s addNew(short i) {
		return addNew(i, i, i);
	}

	public void subtractLocal(short x, short y, short z) {
		_x -= x;
		_y -= y;
		_z -= z;
	}

	public void subtractLocal(Set3s set) {
		subtractLocal(set.getX(), set.getY(), set.getZ());
	}

	public void subtractLocal(short i) {
		subtractLocal(i, i, i);
	}

	public Set3s subtractNew(short x, short y, short z) {
		return new Set3s((short) (_x - x), (short) (_y - y), (short) (_z - z));
	}

	public Set3s subtractNew(Set3s set) {
		return subtractNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3s subtractNew(short i) {
		return subtractNew(i, i, i);
	}

	public void multLocal(short x, short y, short z) {
		_x *= x;
		_y *= y;
		_z *= z;
	}

	public void multLocal(Set3s set) {
		multLocal(set.getX(), set.getY(), set.getZ());
	}

	public void multLocal(short i) {
		multLocal(i, i, i);
	}

	public Set3s multNew(short x, short y, short z) {
		return new Set3s((short) (_x * x), (short) (_y * y), (short) (_z * z));
	}

	public Set3s multNew(Set3s set) {
		return multNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3s multNew(short i) {
		return multNew(i, i, i);
	}

	public void divLocal(short x, short y, short z) {
		_x /= x;
		_y /= y;
		_z /= z;
	}

	public void divLocal(Set3s set) {
		divLocal(set.getX(), set.getY(), set.getZ());
	}

	public void divLocal(short i) {
		divLocal(i, i, i);
	}

	public Set3s divNew(short x, short y, short z) {
		return new Set3s((short) (_x * x), (short) (_y * y), (short) (_z * z));
	}

	public Set3s divNew(Set3s set) {
		return divNew(set.getX(), set.getY(), set.getZ());
	}

	public Set3s divNew(short i) {
		return divNew(i, i, i);
	}

	public short getX() {
		return _x;
	}

	public short getY() {
		return _y;
	}

	public short getZ() {
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

		if (obj instanceof Set3s) {
			Set3s set = (Set3s) obj;
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
	private Set3s plus(Set3s set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param s the number to add to the set
	 * @return the new set
	 */
	private Set3s plus(short s) {
		return addNew(s);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private Set3s minus(Set3s set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param s the number to subtract from the set
	 * @return the new set
	 */
	private Set3s minus(short s) {
		return subtractNew(s);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private Set3s multiply(Set3s set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param s the number to multiply the set by
	 * @return the new set
	 */
	private Set3s multiply(short s) {
		return multNew(s);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private Set3s div(Set3s set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param s the number to divide the set by
	 * @return the new set
	 */
	private Set3s div(short s) {
		return divNew(s);
	}

}
