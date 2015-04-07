package com.mthwate.datlib.math;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void testGcd() throws Exception {
		int range = 10;
		for (int x = -range; x <= range; x++) {
			for (int y = -range; y <= range; y++) {
				try {
					int gcd = MathUtils.gcd(x, y);
					Assert.assertEquals(x % gcd, 0);
					Assert.assertEquals(y % gcd, 0);
				} catch (IllegalArgumentException e) {
					Assert.assertEquals(x, 0);
					Assert.assertEquals(y, 0);
				}

			}
		}
	}
}