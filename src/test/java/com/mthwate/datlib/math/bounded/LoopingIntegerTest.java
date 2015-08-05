package com.mthwate.datlib.math.bounded;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mthwate
 */
public class LoopingIntegerTest {

	@Test
	public void testLoop() {
		Assert.assertEquals(0, (new LoopingInteger(0, 0, 10)).getValue().intValue());
		Assert.assertEquals(0, (new LoopingInteger(10, 0, 10)).getValue().intValue());
		Assert.assertEquals(10, (new LoopingInteger(0, 10, 0)).getValue().intValue());
		Assert.assertEquals(10, (new LoopingInteger(10, 10, 0)).getValue().intValue());
	}
}