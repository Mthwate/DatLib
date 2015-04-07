package com.mthwate.datlib.math;

import java.io.Serializable;

/**
 * @author mthwate
 * @since 1.0
 */
public class Set2f implements Serializable {

	private static final long serialVersionUID = -4566815787927882365L;

	protected float _x;

	protected float _y;

	public Set2f(float x, float y) {
		_x = x;
		_y = y;
	}

	public void addLocal(float x, float y) {
		_x += x;
		_y += y;
	}

	public void addLocal(Set2f set) {
		addLocal(set.getX(), set.getY());
	}

	public void addLocal(float i) {
		addLocal(i, i);
	}

	public Set2f addNew(float x, float y) {
		return new Set2f(_x + x, _y + y);
	}

	public Set2f addNew(Set2f set) {
		return addNew(set.getX(), set.getY());
	}

	public Set2f addNew(float i) {
		return addNew(i, i);
	}

	public void subtractLocal(float x, float y) {
		_x -= x;
		_y -= y;
	}

	public void subtractLocal(Set2f set) {
		subtractLocal(set.getX(), set.getY());
	}

	public void subtractLocal(float i) {
		subtractLocal(i, i);
	}

	public Set2f subtractNew(float x, float y) {
		return new Set2f(_x - x, _y - y);
	}

	public Set2f subtractNew(Set2f set) {
		return subtractNew(set.getX(), set.getY());
	}

	public Set2f subtractNew(float i) {
		return subtractNew(i, i);
	}

	public void multLocal(float x, float y) {
		_x *= x;
		_y *= y;
	}

	public void multLocal(Set2f set) {
		multLocal(set.getX(), set.getY());
	}

	public void multLocal(float i) {
		multLocal(i, i);
	}

	public Set2f multNew(float x, float y) {
		return new Set2f(_x * x, _y * y);
	}

	public Set2f multNew(Set2f set) {
		return multNew(set.getX(), set.getY());
	}

	public Set2f multNew(float i) {
		return multNew(i, i);
	}

	public void divLocal(float x, float y) {
		_x /= x;
		_y /= y;
	}

	public void divLocal(Set2f set) {
		divLocal(set.getX(), set.getY());
	}

	public void divLocal(float i) {
		divLocal(i, i);
	}

	public Set2f divNew(float x, float y) {
		return new Set2f(_x * x, _y * y);
	}

	public Set2f divNew(Set2f set) {
		return divNew(set.getX(), set.getY());
	}

	public Set2f divNew(float i) {
		return divNew(i, i);
	}

	public float getX() {
		return _x;
	}

	public float getY() {
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

		if (obj instanceof Set2f) {
			Set2f set = (Set2f) obj;
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

	private Set2f plus(Set2f set) {
		return addNew(set);
	}

	private Set2f plus(float i) {
		return addNew(i);
	}

	private Set2f minus(Set2f set) {
		return subtractNew(set);
	}

	private Set2f minus(float i) {
		return subtractNew(i);
	}

	private Set2f multiply(Set2f set) {
		return multNew(set);
	}

	private Set2f multiply(float i) {
		return multNew(i);
	}

	private Set2f div(Set2f set) {
		return divNew(set);
	}

	private Set2f div(float i) {
		return divNew(i);
	}
	
}
