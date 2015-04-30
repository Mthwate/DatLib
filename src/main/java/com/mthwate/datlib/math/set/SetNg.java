package com.mthwate.datlib.math.set;

/**
 * @author mthwate
 * @since 1.0
 */
public abstract class SetNg<S extends SetNg, T> implements Cloneable {

	/**
	 * Adds to this set.
	 *
	 * @since 1.0
	 * @param set the set to be added
	 */
	public abstract void addLocal(S set);

	/**
	 * Adds a number to all items in this set.
	 *
	 * @since 1.0
	 * @param n the number to add
	 */
	public abstract void addLocal(T n);

	/**
	 * Adds 2 sets together resulting in a new set.
	 *
	 * @since 1.0
	 * @param set the 2nd set to use
	 * @return the resulting set
	 */
	public abstract S addNew(S set);

	/**
	 * Adds a number to all items in this set resulting in a new set.
	 *
	 * @since 1.0
	 * @param n the number to add
	 * @return the resulting set
	 */
	public abstract S addNew(T n);

	/**
	 * Subtracts from this set.
	 *
	 * @since 1.0
	 * @param set the set to be subtracted
	 */
	public abstract void subtractLocal(S set);

	/**
	 * Subtracts a number from all items in this set.
	 *
	 * @since 1.0
	 * @param n the number to be subtracted
	 */
	public abstract void subtractLocal(T n);

	/**
	 * Subtracts from this set resulting in a new set.
	 *
	 * @since 1.0
	 * @param set the set to subtract
	 * @return the resulting set
	 */
	public abstract S subtractNew(S set);

	/**
	 * Subtracts a number from all items in this set resulting in a new set.
	 *
	 * @since 1.0
	 * @param n the number to subtract
	 * @return the resulting set
	 */
	public abstract S subtractNew(T n);

	/**
	 * Multiplies this set by another set.
	 *
	 * @since 1.0
	 * @param set the set to multiply this set by
	 */
	public abstract void multLocal(S set);

	/**
	 * Multiplies all items in this set by a number.
	 *
	 * @since 1.0
	 * @param n the number to multiply the set by
	 */
	public abstract void multLocal(T n);

	/**
	 * Multiplies this set resulting in a new set.
	 *
	 * @since 1.0
	 * @param set the set to multiply by
	 * @return the resulting set
	 */
	public abstract S multNew(S set);

	/**
	 * Multiplies all items in this set by a number resulting in a new set.
	 *
	 * @since 1.0
	 * @param n the number to multiply by
	 * @return the resulting set
	 */
	public abstract S multNew(T n);

	/**
	 * Divides this set by another set.
	 *
	 * @since 1.0
	 * @param set the set to divide by
	 */
	public abstract void divLocal(S set);

	/**
	 * Divides all items in this set by a number.
	 *
	 * @since 1.0
	 * @param n the number divide the set by
	 */
	public abstract void divLocal(T n);

	/**
	 * Divides this set resulting in a new set.
	 *
	 * @since 1.0
	 * @param set the set to divide by
	 * @return the resulting set
	 */
	public abstract S divNew(S set);

	/**
	 * Divides all items in this set by a number resulting in a new set.
	 *
	 * @since 1.0
	 * @param n the number to divide by
	 * @return the resulting set
	 */
	public abstract S divNew(T n);

	/**
	 * A groovy operator overloading method to add all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to add to the current set
	 * @return the resulting set
	 */
	public S plus(S set) {
		return addNew(set);
	}

	/**
	 * A groovy operator overloading method to add all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to add to the set
	 * @return the resulting set
	 */
	public S plus(T n) {
		return addNew(n);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @since 1.0
	 * @param set the set to subtract from to the current set
	 * @return the resulting set
	 */
	public S minus(S set) {
		return subtractNew(set);
	}

	/**
	 * A groovy operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to subtract from the set
	 * @return the resulting set
	 */
	public S minus(T n) {
		return subtractNew(n);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to multiply the current set by
	 * @return the resulting set
	 */
	public S multiply(S set) {
		return multNew(set);
	}

	/**
	 * A groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to multiply the set by
	 * @return the resulting set
	 */
	public S multiply(T n) {
		return multNew(n);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to divide from the current set
	 * @return the resulting set
	 */
	public S div(S set) {
		return divNew(set);
	}

	/**
	 * A groovy operator overloading method to divide all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to divide the set by
	 * @return the resulting set
	 */
	public S div(T n) {
		return divNew(n);
	}

	@Override
	public abstract SetNg<S, T> clone();

}
