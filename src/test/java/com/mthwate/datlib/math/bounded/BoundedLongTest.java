package com.mthwate.datlib.math.bounded;

import org.junit.Assert;

/**
 * @author mthwate
 */
class BoundedLongTest {

	private final long min = 0;

	private final long max = 10;

	private long val = min + max / 2;

	private final BoundedLong bounded = new BoundedLong(val, min, max);

	void testBoundless() {
		BoundedLong bounded = new BoundedLong(val, null, null);
		bounded.addLocal(10L);
	}

	void testAddition() {

		for (long i = 0; i < val * 2; i++) {

			BoundedLong b1 = bounded.addNew(i);
			Assert.assertEquals(b1.getValue().longValue(), Math.min(max, val+i));

		}

	}

	void testSubtraction() {

		for (long i = 0; i < val * 2; i++) {

			BoundedLong b2 = bounded.subtractNew(i);
			Assert.assertEquals(b2.getValue().longValue(), Math.max(min, val-i));

		}

	}

}
