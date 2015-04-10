package com.mthwate.datlib.math;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {

	@Test
	public void testGcd() throws Exception {
		int range = 10;
		for (int x = -range; x <= range; x++) {
			for (int y = -range; y <= range; y++) {
				int gcd = MathUtils.gcd(x, y);
				if (gcd == 0) {
					Assert.assertEquals(x, 0);
					Assert.assertEquals(y, 0);
				} else {
					Assert.assertEquals(x % gcd, 0);
					Assert.assertEquals(y % gcd, 0);
				}
			}
		}
	}
}