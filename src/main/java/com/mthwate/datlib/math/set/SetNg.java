package com.mthwate.datlib.math.set;

/**
 * @author mthwate
 * @since 1.0
 */
@Deprecated
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
	 * @param n the number to divide the set by
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
	 * Divides modulo this set by another set.
	 *
	 * @since 1.2
	 * @param set the set to divide modulo by
	 */
	public abstract void modLocal(S set);

	/**
	 * Divides modulo all items in this set by a number.
	 *
	 * @since 1.2
	 * @param n the number to divide modulo the set by
	 */
	public abstract void modLocal(T n);

	/**
	 * Divides modulo this set resulting in a new set.
	 *
	 * @since 1.2
	 * @param set the set to divide modulo by
	 * @return the resulting set
	 */
	public abstract S modNew(S set);

	/**
	 * Divides modulo all items in this set by a number resulting in a new set.
	 *
	 * @since 1.2
	 * @param n the number to divide modulo by
	 * @return the resulting set
	 */
	public abstract S modNew(T n);

	/**
	 * A Groovy and Kotlin operator overloading method to add all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to add to the current set
	 * @return the resulting set
	 */
	public S plus(S set) {
		return addNew(set);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to add all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to add to the set
	 * @return the resulting set
	 */
	public S plus(T n) {
		return addNew(n);
	}

	/**
	 * AGroovy and Kotlin operator overloading method to subtract all numbers in a set from all the numbers in this set..
	 *
	 * @since 1.0
	 * @param set the set to subtract from to the current set
	 * @return the resulting set
	 */
	public S minus(S set) {
		return subtractNew(set);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to subtract all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to subtract from the set
	 * @return the resulting set
	 */
	public S minus(T n) {
		return subtractNew(n);
	}

	/**
	 * A Groovy operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to multiply the current set by
	 * @return the resulting set
	 */
	public S multiply(S set) {
		return multNew(set);
	}

	/**
	 * A Groovy operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to multiply the set by
	 * @return the resulting set
	 */
	public S multiply(T n) {
		return multNew(n);
	}

	/**
	 * A Kotlin operator overloading method to multiply all numbers in the set by all numbers in another set.
	 *
	 * @since 1.2
	 * @param set the set to multiply the current set by
	 * @return the resulting set
	 */
	public S times(S set) {
		return multNew(set);
	}

	/**
	 * A Kotlin operator overloading method to multiply all numbers in the set by a number.
	 *
	 * @since 1.2
	 * @param n the number to multiply the set by
	 * @return the resulting set
	 */
	public S times(T n) {
		return multNew(n);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to divide all numbers in the set by all numbers in another set.
	 *
	 * @since 1.0
	 * @param set the set to divide from the current set
	 * @return the resulting set
	 */
	public S div(S set) {
		return divNew(set);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to divide all numbers in the set by a number.
	 *
	 * @since 1.0
	 * @param n the number to divide the set by
	 * @return the resulting set
	 */
	public S div(T n) {
		return divNew(n);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to divide modulo all numbers in the set by all numbers in another set.
	 *
	 * @since 1.2
	 * @param set the set to divide modulo from the current set
	 * @return the resulting set
	 */
	public S mod(S set) {
		return modNew(set);
	}

	/**
	 * A Groovy and Kotlin operator overloading method to divide modulo all numbers in the set by a number.
	 *
	 * @since 1.2
	 * @param n the number to divide modulo the set by
	 * @return the resulting set
	 */
	public S mod(T n) {
		return modNew(n);
	}

	@Override
	public abstract S clone();

}
