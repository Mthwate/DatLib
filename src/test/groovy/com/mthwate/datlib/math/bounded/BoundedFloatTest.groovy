package com.mthwate.datlib.math.bounded

import org.junit.Assert

/**
 * @author mthwate
 */
class BoundedFloatTest extends GroovyTestCase {

	private final int min = 0;

	private final int max = 10;

	private int val = min + max / 2;

	private final BoundedFloat bounded = new BoundedFloat(val, min, max);

	void testBoundless() {
		BoundedFloat bounded = new BoundedFloat(val, null, null);
		bounded.addLocal(10);
	}

	void testAddition() {

		for (int i = 0; i < val * 2; i++) {

			BoundedFloat b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue(), Math.min(max, val+i), 0);

		}

	}

	void testSubtraction() {

		for (int i = 0; i < val * 2; i++) {

			BoundedFloat b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue(), Math.max(min, val-i), 0);

		}

	}

}
