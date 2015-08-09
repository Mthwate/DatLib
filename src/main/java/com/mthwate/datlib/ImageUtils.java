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
	 * @param img1 The first image to be compared
	 * @param img2 The second image to be compared
	 * @return The difference between the two images as an arbitrary double
	 */
	public static double calculateImageDiff(BufferedImage img1, BufferedImage img2) {

		int width1 = img1.getWidth(null);
		int width2 = img2.getWidth(null);
		int height1 = img1.getHeight(null);
		int height2 = img2.getHeight(null);
		if ((width1 != width2) || (height1 != height2)) {
			throw new IllegalArgumentException("Image dimensions do not match");
		}
		long diff = 0;
		for (int y = 0; y < height1; y++) {
			for (int x = 0; x < width1; x++) {
				int rgb1 = img1.getRGB(x, y);
				int rgb2 = img2.getRGB(x, y);
				int r1 = (rgb1 >> 16) & 0xff;
				int g1 = (rgb1 >>  8) & 0xff;
				int b1 = (rgb1	  ) & 0xff;
				int r2 = (rgb2 >> 16) & 0xff;
				int g2 = (rgb2 >>  8) & 0xff;
				int b2 = (rgb2	  ) & 0xff;
				diff += Math.abs(r1 - r2);
				diff += Math.abs(g1 - g2);
				diff += Math.abs(b1 - b2);
			}
		}
		double n = width1 * height1 * 3;
		return diff / n / 255.0;
	}

}
