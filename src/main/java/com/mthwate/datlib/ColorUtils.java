package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.2
 */
public class ColorUtils {

	/**
	 * Gets the alpha value from an ARGB value
	 *
	 * @param argb the ARGB value to use
	 * @return the alpha value
	 * @since 2.0
	 */
	public static byte getArgbAlpha(int argb) {
		return (byte) ((argb >> 24) & 0xFF);
	}

	/**
	 * Gets the red value from an ARGB value
	 *
	 * @param argb the ARGB value to use
	 * @return the red value
	 * @since 2.0
	 */
	public static byte getArgbRed(int argb) {
		return (byte) ((argb >> 16) & 0xFF);
	}

	/**
	 * Gets the green value from an ARGB value
	 *
	 * @param argb the ARGB value to use
	 * @return the green value
	 * @since 2.0
	 */
	public static byte getArgbGreen(int argb) {
		return (byte) ((argb >> 8) & 0xFF);
	}

	/**
	 * Gets the blue value from an ARGB value
	 *
	 * @param argb the ARGB value to use
	 * @return the blue value
	 * @since 2.0
	 */
	public static byte getArgbBlue(int argb) {
		return (byte) (argb & 0xFF);
	}

	/**
	 * Gets the red value from an RGBA value
	 *
	 * @param rgba the RGBA value to use
	 * @return the red value
	 * @since 2.0
	 */
	public static byte getRgbaRed(int rgba) {
		return (byte) ((rgba >> 24) & 0xFF);
	}

	/**
	 * Gets the green value from an RGBA value
	 *
	 * @param rgba the RGBA value to use
	 * @return the green value
	 * @since 2.0
	 */
	public static byte getRgbaGreen(int rgba) {
		return (byte) ((rgba >> 16) & 0xFF);
	}

	/**
	 * Gets the blue value from an RGBA value
	 *
	 * @param rgba the RGBA value to use
	 * @return the blue value
	 * @since 2.0
	 */
	public static byte getRgbaBlue(int rgba) {
		return (byte) ((rgba >> 8) & 0xFF);
	}

	/**
	 * Gets the alpha value from an RGBA value
	 *
	 * @param rgba the RGBA value to use
	 * @return the alpha value
	 * @since 2.0
	 */
	public static byte getRgbaAlpha(int rgba) {
		return (byte) (rgba & 0xFF);
	}

}
