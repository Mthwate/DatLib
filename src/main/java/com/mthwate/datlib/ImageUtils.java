package com.mthwate.datlib;

import java.awt.image.BufferedImage;

/**
 * @author lordxarus
 * @since 1.2
 */

public class ImageUtils {

	/**
	 * The total difference between two images calculated as the sum of the difference in RGB values of each pixel
	 * the images MUST be the same dimensions.
	 *
	 * @since 1.2
	 * @param img1 the first image to be compared
	 * @param img2 the second image to be compared
	 * @return the difference between the two images
	 */
	public static long totalImageDiff(BufferedImage img1, BufferedImage img2) {

		int width = img1.getWidth();
		int height = img1.getHeight();

		if ((width != img2.getWidth()) || (height != img2.getHeight())) {
			throw new IllegalArgumentException("Image dimensions do not match");
		}

		long diff = 0;
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int rgb1 = img1.getRGB(x, y);
				int rgb2 = img2.getRGB(x, y);
				int a1 = ColorUtils.getAlpha(rgb1);
				int r1 = ColorUtils.getRed(rgb1);
				int g1 = ColorUtils.getGreen(rgb1);
				int b1 = ColorUtils.getBlue(rgb1);
				int a2 = ColorUtils.getAlpha(rgb2);
				int r2 = ColorUtils.getRed(rgb2);
				int g2 = ColorUtils.getGreen(rgb2);
				int b2 = ColorUtils.getBlue(rgb2);
				diff += Math.abs(a1 - a2);
				diff += Math.abs(r1 - r2);
				diff += Math.abs(g1 - g2);
				diff += Math.abs(b1 - b2);
			}
		}

		return diff;
	}

	/**
	 * Checks if two images have any differences.
	 *
	 * @since 1.2
	 * @param img1 the first image to be compared
	 * @param img2 the second image to be compared
	 * @return if the images differ or not
	 */
	public static boolean imageDiffer(BufferedImage img1, BufferedImage img2) {
		return totalImageDiff(img1, img2) > 0;
	}

}
