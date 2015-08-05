package com.mthwate.datlib.math.bounded;

import org.junit.Assert;

/**
 * @author mthwate
 */
class BoundedDoubleTest {

	private final double min = 0;

	private final double max = 10;

	private double val = min + max / 2;

	private final BoundedDouble bounded = new BoundedDouble(val, min, max);

	void testBoundless() {
		BoundedDouble bounded = new BoundedDouble(val, null, null);
		bounded.addLocal(10.0);
	}

	void testAddition() {

		for (double i = 0; i < val * 2; i++) {

			BoundedDouble b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue(), Math.min(max, val+i), 0);

		}

	}

	void testSubtraction() {

		for (double i = 0; i < val * 2; i++) {

			BoundedDouble b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue(), Math.max(min, val-i), 0);

		}

	}

}
