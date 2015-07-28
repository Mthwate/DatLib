package com.mthwate.datlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author mthwate
 * @since 1.2
 */
public class PropertiesFactory {

	/**
	 * Loads properties from an input stream.
	 *
	 * @since 1.2
	 * @param input the input stream to read properties from
	 * @return the properties
	 * @throws IOException an error occurred while reading the properties stream
	 */
	public static Properties load(InputStream input) throws IOException {
		Properties properties = new Properties();
		properties.load(input);
		return properties;
	}

	/**
	 * Loads properties from a file.
	 *
	 * @since 1.2
	 * @param file the file to read properties from
	 * @return the properties
	 * @throws IOException an error occurred while reading the properties file
	 */
	public static Properties load(File file) throws IOException {
		FileInputStream input = new FileInputStream(file);
		Properties properties = null;
		try {
			properties = load(input);
		} finally {
			IOUtils.close(input);
		}
		return properties;
	}

}
