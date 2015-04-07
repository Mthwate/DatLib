package com.mthwate.datlib;

/**
 * @author mthwate
 * @since 1.0
 */
public class StringUtils {

	public static String join(String[] elements, String joiner) {
		return join(elements, 0, joiner);
	}

	public static String join(String[] elements, int startIndex, String joiner) {
		String out = "";
		for (int i = startIndex; i < elements.length; i++) {
			out += elements[i];
			if (i != elements.length - 1) {
				out += joiner;
			}
		}
		return out;
	}
	
}
