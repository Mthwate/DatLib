package com.mthwate.datlib;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mthwate
 */
public class ColorUtilsTest {

	@Test
	public void testArgb() {
		Assert.assertEquals(ColorUtils.getArgbAlpha(0xAA8000FF), (byte) 0xAA);
		Assert.assertEquals(ColorUtils.getArgbRed(0xAA8000FF), (byte) 0x80);
		Assert.assertEquals(ColorUtils.getArgbGreen(0xAA8000FF), (byte) 0x00);
		Assert.assertEquals(ColorUtils.getArgbBlue(0xAA8000FF), (byte) 0xFF);
	}

	@Test
	public void testRgba() {
		Assert.assertEquals(ColorUtils.getRgbaRed(0xAA8000FF), (byte) 0xAA);
		Assert.assertEquals(ColorUtils.getRgbaGreen(0xAA8000FF), (byte) 0x80);
		Assert.assertEquals(ColorUtils.getRgbaBlue(0xAA8000FF), (byte) 0x00);
		Assert.assertEquals(ColorUtils.getRgbaAlpha(0xAA8000FF), (byte) 0xFF);
	}

}
