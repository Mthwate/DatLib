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

	private Set2d plus(Set2d set) {
		return addNew(set);
	}

	private Set2d plus(double i) {
		return addNew(i);
	}

	private Set2d minus(Set2d set) {
		return subtractNew(set);
	}

	private Set2d minus(double i) {
		return subtractNew(i);
	}

	private Set2d multiply(Set2d set) {
		return multNew(set);
	}

	private Set2d multiply(double i) {
		return multNew(i);
	}

	private Set2d div(Set2d set) {
		return divNew(set);
	}

	private Set2d div(double i) {
		return divNew(i);
	}
	
}
