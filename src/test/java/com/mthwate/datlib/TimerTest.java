package com.mthwate.datlib;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

	@Test
	public void testTimer() {
		Timer t = new Timer();
		TimeUtils.sleep(1000);
		Assert.assertEquals(1, t.getSec(), 0.01);
	}
}