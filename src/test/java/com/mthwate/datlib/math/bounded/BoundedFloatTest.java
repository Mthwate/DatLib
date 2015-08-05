package com.mthwate.datlib.math.bounded;

import org.junit.Assert;

/**
 * @author mthwate
 */
class BoundedFloatTest {

	private final float min = 0;

	private final float max = 10;

	private float val = min + max / 2;

	private final BoundedFloat bounded = new BoundedFloat(val, min, max);

	void testBoundless() {
		BoundedFloat bounded = new BoundedFloat(val, null, null);
		bounded.addLocal(10F);
	}

	void testAddition() {

		for (float i = 0; i < val * 2; i++) {

			BoundedFloat b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue(), Math.min(max, val+i), 0);

		}

	}

	void testSubtraction() {

		for (float i = 0; i < val * 2; i++) {

			BoundedFloat b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue(), Math.max(min, val-i), 0);

		}

	}

}
