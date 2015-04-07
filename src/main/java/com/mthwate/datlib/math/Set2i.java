package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2i implements Serializable {

	private static final long serialVersionUID = 3039497236768820386L;

	protected int _x;
	
	protected int _y;
	
	public Set2i(int x, int y) {
		_x = x;
		_y = y;
	}
	
	public void addLocal(int x, int y) {
		_x += x;
		_y += y;
	}

	public void addLocal(Set2i set) {
		addLocal(set.getX(), set.getY());
	}

	public void addLocal(int i) {
		addLocal(i, i);
	}

	public Set2i addNew(int x, int y) {
		return new Set2i(_x + x, _y + y);
	}

	public Set2i addNew(Set2i set) {
		return addNew(set.getX(), set.getY());
	}

	public Set2i addNew(int i) {
		return addNew(i, i);
	}

	public void subtractLocal(int x, int y) {
		_x -= x;
		_y -= y;
	}

	public void subtractLocal(Set2i set) {
		subtractLocal(set.getX(), set.getY());
	}

	public void subtractLocal(int i) {
		subtractLocal(i, i);
	}

	public Set2i subtractNew(int x, int y) {
		return new Set2i(_x - x, _y - y);
	}

	public Set2i subtractNew(Set2i set) {
		return subtractNew(set.getX(), set.getY());
	}

	public Set2i subtractNew(int i) {
		return subtractNew(i, i);
	}

	public void multLocal(int x, int y) {
		_x *= x;
		_y *= y;
	}

	public void multLocal(Set2i set) {
		multLocal(set.getX(), set.getY());
	}

	public void multLocal(int i) {
		multLocal(i, i);
	}

	public Set2i multNew(int x, int y) {
		return new Set2i(_x * x, _y * y);
	}

	public Set2i multNew(Set2i set) {
		return multNew(set.getX(), set.getY());
	}

	public Set2i multNew(int i) {
		return multNew(i, i);
	}

	public void divLocal(int x, int y) {
		_x /= x;
		_y /= y;
	}

	public void divLocal(Set2i set) {
		divLocal(set.getX(), set.getY());
	}

	public void divLocal(int i) {
		divLocal(i, i);
	}

	public Set2i divNew(int x, int y) {
		return new Set2i(_x * x, _y * y);
	}

	public Set2i divNew(Set2i set) {
		return divNew(set.getX(), set.getY());
	}

	public Set2i divNew(int i) {
		return divNew(i, i);
	}
	
	public int getX() {
		return _x;
	}

	public int getY() {
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
		
		if (obj instanceof Set2i) {
			Set2i set = (Set2i) obj;
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
	private Set2i plus(Set2i set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param i the number to add to the set
	 * @return the new set
	 */
	private Set2i plus(int i) {
		return addNew(i);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private Set2i minus(Set2i set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param i the number to subtract from the set
	 * @return the new set
	 */
	private Set2i minus(int i) {
		return subtractNew(i);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private Set2i multiply(Set2i set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param i the number to multiply the set by
	 * @return the new set
	 */
	private Set2i multiply(int i) {
		return multNew(i);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private Set2i div(Set2i set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param i the number to divide the set by
	 * @return the new set
	 */
	private Set2i div(int i) {
		return divNew(i);
	}
	
}
