package com.mthwate.datlib;

import java.util.Random;

/**
 * A static version of {@link Random}
 *
 * @author mthwate
 * @since 1.2
 */
public class StaticRandom {

	private static Random rand = new Random();

	/**
	 * A static version of {@link Random#nextInt()}
	 */
	public static int nextInt() {
		return rand.nextInt();
	}

	/**
	 * A static version of {@link Random#nextInt(int)}
	 */
	public static int nextInt(int n) {
		return rand.nextInt(n);
	}

	/**
	 * A static version of {@link Random#nextBoolean()}
	 */
	public static boolean nextBoolean() {
		return rand.nextBoolean();
	}

	/**
	 * A static version of {@link Random#nextDouble()}
	 */
	public static double nextDouble() {
		return rand.nextDouble();
	}

	/**
	 * A static version of {@link Random#nextFloat()}
	 */
	public static float nextFloat() {
		return rand.nextFloat();
	}

	/**
	 * A static version of {@link Random#nextLong()}
	 */
	public static long nextLong() {
		return rand.nextLong();
	}

	/**
	 * A static version of {@link Random#nextGaussian()}
	 */
	public static double nextGaussian() {
		return rand.nextGaussian();
	}

	/**
	 * A static version of {@link Random#nextBytes(byte[])}
	 */
	public static void nextBytes(byte[] bytes) {
		rand.nextBytes(bytes);
	}

}
