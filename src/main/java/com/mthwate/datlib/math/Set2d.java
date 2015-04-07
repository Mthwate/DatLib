package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2d implements Serializable {

	private static final long serialVersionUID = 7545185431305740320L;

	protected double _x;

	protected double _y;

	public Set2d(double x, double y) {
		_x = x;
		_y = y;
	}

	public void addLocal(double x, double y) {
		_x += x;
		_y += y;
	}

	public void addLocal(Set2d set) {
		addLocal(set.getX(), set.getY());
	}

	public void addLocal(double i) {
		addLocal(i, i);
	}

	public Set2d addNew(double x, double y) {
		return new Set2d(_x + x, _y + y);
	}

	public Set2d addNew(Set2d set) {
		return addNew(set.getX(), set.getY());
	}

	public Set2d addNew(double i) {
		return addNew(i, i);
	}

	public void subtractLocal(double x, double y) {
		_x -= x;
		_y -= y;
	}

	public void subtractLocal(Set2d set) {
		subtractLocal(set.getX(), set.getY());
	}

	public void subtractLocal(double i) {
		subtractLocal(i, i);
	}

	public Set2d subtractNew(double x, double y) {
		return new Set2d(_x - x, _y - y);
	}

	public Set2d subtractNew(Set2d set) {
		return subtractNew(set.getX(), set.getY());
	}

	public Set2d subtractNew(double i) {
		return subtractNew(i, i);
	}

	public void multLocal(double x, double y) {
		_x *= x;
		_y *= y;
	}

	public void multLocal(Set2d set) {
		multLocal(set.getX(), set.getY());
	}

	public void multLocal(double i) {
		multLocal(i, i);
	}

	public Set2d multNew(double x, double y) {
		return new Set2d(_x * x, _y * y);
	}

	public Set2d multNew(Set2d set) {
		return multNew(set.getX(), set.getY());
	}

	public Set2d multNew(double i) {
		return multNew(i, i);
	}

	public void divLocal(double x, double y) {
		_x /= x;
		_y /= y;
	}

	public void divLocal(Set2d set) {
		divLocal(set.getX(), set.getY());
	}

	public void divLocal(double i) {
		divLocal(i, i);
	}

	public Set2d divNew(double x, double y) {
		return new Set2d(_x * x, _y * y);
	}

	public Set2d divNew(Set2d set) {
		return divNew(set.getX(), set.getY());
	}

	public Set2d divNew(double i) {
		return divNew(i, i);
	}

	public double getX() {
		return _x;
	}

	public double getY() {
		return _y;
	}

	@Override
	public int hashCode() {
		int result = (int) _x;
		result = 31 * result + (int) _y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;

		if (obj instanceof Set2d) {
			Set2d set = (Set2d) obj;
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
	private Set2d plus(Set2d set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param d the number to add to the set
	 * @return the new set
	 */
	private Set2d plus(double d) {
		return addNew(d);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private Set2d minus(Set2d set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param d the number to subtract from the set
	 * @return the new set
	 */
	private Set2d minus(double d) {
		return subtractNew(d);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private Set2d multiply(Set2d set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param d the number to multiply the set by
	 * @return the new set
	 */
	private Set2d multiply(double d) {
		return multNew(d);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private Set2d div(Set2d set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param d the number to divide the set by
	 * @return the new set
	 */
	private Set2d div(double d) {
		return divNew(d);
	}
	
}
