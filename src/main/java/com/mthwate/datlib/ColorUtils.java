package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.2
 */
public class ColorUtils {

	public static int getAlpha(int rgb) {
		return (rgb >> 24) & 0xFF;
	}

	public static int getRed(int rgb) {
		return (rgb >> 16) & 0xFF;
	}

	public static int getGreen(int rgb) {
		return (rgb >> 8) & 0xFF;
	}

	public static int getBlue(int rgb) {
		return rgb & 0xFF;
	}

}
