package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.0
 */
public class StringUtils {

	public static String join(String[] elements) {
		return join(elements, "");
	}

	public static String join(String[] elements, String joiner) {
		return join(elements, joiner, 0);
	}

	public static String join(String[] elements, String joiner, int startIndex) {
		return join(elements, joiner, startIndex, elements.length);
	}

	public static String join(String[] elements, String joiner, int startIndex, int endIndex) {
		StringBuilder sb = new StringBuilder();
		for (int i = startIndex; i < endIndex; i++) {
			sb.append(elements[i]);
			if (i != endIndex - 1) {
				sb.append(joiner);
			}
		}
		return sb.toString();
	}
	
}
