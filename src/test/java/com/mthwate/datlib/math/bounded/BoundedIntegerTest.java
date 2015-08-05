package com.mthwate.datlib.math.bounded;

import org.junit.Assert;

/**
 * @author mthwate
 */
class BoundedIntegerTest {

	private final int min = 0;

	private final int max = 10;

	private int val = min + max / 2;

	private final BoundedInteger bounded = new BoundedInteger(val, min, max);

	void testBoundless() {
		BoundedInteger bounded = new BoundedInteger(val, null, null);
		bounded.addLocal(10);
	}

	void testAddition() {

		for (int i = 0; i < val * 2; i++) {

			BoundedInteger b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue().intValue(), Math.min(max, val+i));

		}

	}

	void testSubtraction() {

		for (int i = 0; i < val * 2; i++) {

			BoundedInteger b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue().intValue(), Math.max(min, val-i));

		}

	}

}
