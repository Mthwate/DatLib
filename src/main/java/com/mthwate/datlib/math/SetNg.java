package com.mthwate.datlib.math;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class SetNg<S extends SetNg, T> {

	public abstract void addLocal(S set);

	public abstract void addLocal(T n);

	public abstract S addNew(S set);

	public abstract S addNew(T n);

	public abstract void subtractLocal(S set);

	public abstract void subtractLocal(T n);

	public abstract S subtractNew(S set);

	public abstract S subtractNew(T n);

	public abstract void multLocal(S set);

	public abstract void multLocal(T n);

	public abstract S multNew(S set);

	public abstract S multNew(T n);

	public abstract void divLocal(S set);

	public abstract void divLocal(T n);

	public abstract S divNew(S set);

	public abstract S divNew(T n);

	/**
	 * A groovy operator overloading method to add all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to add to the current set
	 * @return the new set
	 */
	private S plus(S set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @param n the number to add to the set
	 * @return the new set
	 */
	private S plus(T n) {
		return addNew(n);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @param set the set to subtract from to the current set
	 * @return the new set
	 */
	private S minus(S set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @param n the number to subtract from the set
	 * @return the new set
	 */
	private S minus(T n) {
		return subtractNew(n);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to multiply the current set by
	 * @return the new set
	 */
	private S multiply(S set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @param n the number to multiply the set by
	 * @return the new set
	 */
	private S multiply(T n) {
		return multNew(n);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @param set the set to divide from the current set
	 * @return the new set
	 */
	private S div(S set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @param n the number to divide the set by
	 * @return the new set
	 */
	private S div(T n) {
		return divNew(n);
	}

}
