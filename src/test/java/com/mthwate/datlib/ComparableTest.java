package com.mthwate.datlib;

import com.mthwate.datlib.math.fraction.FractionInteger;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mthwate
 */
public class ComparableTest {


	@Test
	public void testFractionInteger() {

		int range = 10;

		for (int a = -range; a <= range; a++) {
			for (int b = -range; b <= range; b++) {
				for (int c = -range; c <= range; c++) {
					for (int d = -range; d <= range; d++) {
						if (b != 0 && d != 0) {

							FractionInteger f1 = new FractionInteger(a, b);
							FractionInteger f2 = new FractionInteger(c, d);

							Assert.assertTrue(test(f1, f2));

							for (int e = -range; e <= range; e++) {
								for (int f = -range; f <= range; f++) {
									if (f != 0) {
										FractionInteger f3 = new FractionInteger(e, f);

										Assert.assertTrue(test(f1, f2, f3));
									}
								}
							}
						}
					}
				}
			}
		}

	}

	private static <T extends Comparable<T>> boolean test(T c1, T c2) {

		boolean t1 = c1.compareTo(c2) == -c2.compareTo(c1);

		boolean t2 = (c1.compareTo(c2) == 0) == c1.equals(c2);

		return t1 && t2;
	}

	private static <T extends Comparable<T>> boolean test(T c1, T c2, T c3) {
		boolean success = true;

		int t1 = c1.compareTo(c2);
		int t2 = c2.compareTo(c3);

		if (t1 > 0 && t2 > 0) {
			success = c1.compareTo(c3) > 0;
		} else if (t1 < 0 && t2 < 0) {
			success = c1.compareTo(c3) < 0;
		} else if (t1 == 0 && t2 == 0) {
			success = c1.compareTo(c3) == 0;
		}

		return success;
	}

}
