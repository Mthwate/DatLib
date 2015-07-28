package com.mthwate.datlib;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author mthwate
 * @since 1.2
 */
public class PropertyUtils {

	/**
	 * Retrieves a value from a properties input stream.
	 *
	 * @since 1.2
	 * @param input the properties input stream
	 * @param key the property key
	 * @return the value retrieved with the supplied key
	 */
	public static String getProperty(InputStream input, String key) {
		return getProperty(input, key, null);
	}

	/**
	 * Retrieves a value from a properties file.
	 *
	 * @since 1.2
	 * @param file the properties file
	 * @param key the property key
	 * @return the value retrieved with the supplied key
	 */
	public static String getProperty(File file, String key) {
		return getProperty(file, key, null);
	}

	/**
	 * Retrieves a value from a properties input stream.
	 *
	 * @since 1.2
	 * @param input the properties input stream
	 * @param key the property key
	 * @param defaultValue the fallback value to use
	 * @return the value retrieved with the supplied key
	 */
	public static String getProperty(InputStream input, String key, String defaultValue) {
		String property = null;
		try {
			property = PropertiesFactory.load(input).getProperty(key);
		} catch (IOException e) {}
		return property == null ? defaultValue : property;
	}

	/**
	 * Retrieves a value from a properties file.
	 *
	 * @since 1.2
	 * @param file the properties file
	 * @param key the property key
	 * @param defaultValue the fallback value to use
	 * @return the value retrieved with the supplied key
	 */
	public static String getProperty(File file, String key, String defaultValue) {
		String property = null;
		try {
			property = PropertiesFactory.load(file).getProperty(key);
		} catch (IOException e) {}
		return property == null ? defaultValue : property;
	}

}
