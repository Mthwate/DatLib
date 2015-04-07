package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2s implements Serializable {

	private static final long serialVersionUID = -4548210676384778914L;

	protected short _x;

	protected short _y;

	public Set2s(short x, short y) {
		_x = x;
		_y = y;
	}

	public void addLocal(short x, short y) {
		_x += x;
		_y += y;
	}

	public void addLocal(Set2s set) {
		addLocal(set.getX(), set.getY());
	}

	public void addLocal(short i) {
		addLocal(i, i);
	}

	public Set2s addNew(short x, short y) {
		return new Set2s((short) (_x + x), (short) (_y + y));
	}

	public Set2s addNew(Set2s set) {
		return addNew(set.getX(), set.getY());
	}

	public Set2s addNew(short i) {
		return addNew(i, i);
	}

	public void subtractLocal(short x, short y) {
		_x -= x;
		_y -= y;
	}

	public void subtractLocal(Set2s set) {
		subtractLocal(set.getX(), set.getY());
	}

	public void subtractLocal(short i) {
		subtractLocal(i, i);
	}

	public Set2s subtractNew(short x, short y) {
		return new Set2s((short) (_x - x), (short) (_y - y));
	}

	public Set2s subtractNew(Set2s set) {
		return subtractNew(set.getX(), set.getY());
	}

	public Set2s subtractNew(short i) {
		return subtractNew(i, i);
	}

	public void multLocal(short x, short y) {
		_x *= x;
		_y *= y;
	}

	public void multLocal(Set2s set) {
		multLocal(set.getX(), set.getY());
	}

	public void multLocal(short i) {
		multLocal(i, i);
	}

	public Set2s multNew(short x, short y) {
		return new Set2s((short) (_x * x), (short) (_y * y));
	}

	public Set2s multNew(Set2s set) {
		return multNew(set.getX(), set.getY());
	}

	public Set2s multNew(short i) {
		return multNew(i, i);
	}

	public void divLocal(short x, short y) {
		_x /= x;
		_y /= y;
	}

	public void divLocal(Set2s set) {
		divLocal(set.getX(), set.getY());
	}

	public void divLocal(short i) {
		divLocal(i, i);
	}

	public Set2s divNew(short x, short y) {
		return new Set2s((short) (_x * x), (short) (_y * y));
	}

	public Set2s divNew(Set2s set) {
		return divNew(set.getX(), set.getY());
	}

	public Set2s divNew(short i) {
		return divNew(i, i);
	}

	public short getX() {
		return _x;
	}

	public short getY() {
		return _y;
	}

	@Override
	public int hashCode() {
		int result = _x;
		result = 31 * result + _y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set2s) {
			Set2s set = (Set2s) obj;
			if (_x == set.getX() && _y == set.getY()) {
				equals = true;
			}
		}

		return equals;
	}

	@Override
	public String toString() {
		return "(" + _x + ", " + _y + ")";
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to add to the current set
	 * @return the new set
	 */
	private Set2s plus(Set2s set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param s the number to add to the set
	 * @return the new set
	 */
	private Set2s plus(short s) {
		return addNew(s);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private Set2s minus(Set2s set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param s the number to subtract from the set
	 * @return the new set
	 */
	private Set2s minus(short s) {
		return subtractNew(s);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private Set2s multiply(Set2s set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param s the number to multiply the set by
	 * @return the new set
	 */
	private Set2s multiply(short s) {
		return multNew(s);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private Set2s div(Set2s set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param s the number to divide the set by
	 * @return the new set
	 */
	private Set2s div(short s) {
		return divNew(s);
	}
}