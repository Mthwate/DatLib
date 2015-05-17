package com.mthwate.datlib.math.bounded

import org.junit.Assert

/**
 * @author mthwate
 */
class BoundedLongTest extends GroovyTestCase {

	private final int min = 0;

	private final int max = 10;

	private int val = min + max / 2;

	private final BoundedLong bounded = new BoundedLong(val, min, max);

	void testBoundless() {
		BoundedLong bounded = new BoundedLong(val, null, null);
		bounded.addLocal(10);
	}

	void testAddition() {

		for (int i = 0; i < val * 2; i++) {

			BoundedLong b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue(), Math.min(max, val+i));

		}

	}

	void testSubtraction() {

		for (int i = 0; i < val * 2; i++) {

			BoundedLong b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue(), Math.max(min, val-i));

		}

	}

}
