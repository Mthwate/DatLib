package com.mthwate.datlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author mthwate
 * @since 1.0
 * @deprecated use {@link PropertiesFactory} instead
 */
@Deprecated
public class PropUtils {

	/**
	 * Loads properties from a file in the classpath.
	 *
	 * @since 1.0
	 * @param path the path of the properties file
	 * @return the properties
	 * @throws IOException an error occurred while reading the file
	 */
	public static Properties loadClasspath(String path) throws IOException {
		InputStream input = PropUtils.class.getClassLoader().getResourceAsStream(path);
		Properties prop = null;
		try {
			prop = load(input);
		} finally {
			IOUtils.close(input);
		}
		return prop;
	}

	/**
	 * Loads properties from a file.
	 *
	 * @since 1.0
	 * @param file the file to read properties from
	 * @return the properties
	 * @throws IOException an error occurred while reading the file
	 */
	public static Properties loadFile(File file) throws IOException {
		InputStream input = new FileInputStream(file);
		Properties prop = null;
		try {
			prop = load(input);
		} finally {
			IOUtils.close(input);
		}
		return prop;
	}
	/**
	 * Loads properties from an input stream.
	 *
	 * @since 1.0
	 * @param input the input stream to read properties from
	 * @return the properties
	 * @throws IOException an error occurred while reading the properties
	 */
	public static Properties load(InputStream input) throws IOException {
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			throw new IOException("Failed to read properties from input");
		}
		return prop;
	}

}
