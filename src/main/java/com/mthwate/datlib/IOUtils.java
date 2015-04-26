package com.mthwate.datlib;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author mthwate
 * @since 1.0
 */
public class IOUtils {

	/**
	 * Silently closes any object implementing closeable.
	 * Can safely accept null objects.
	 *
	 * @since 1.0
	 * @param c the object to close
	 */
	public static void close(Closeable c) {
		if (c != null) {
			try {
				c.close();
			} catch (IOException e) {}
		}
	}

	/**
	 * Gets the jar file a class is contained in.
	 *
	 * @since 1.0
	 * @param clazz the class to get the container of
	 * @return the jar file the class is contained in
	 */
	public static File getClassJar(Class clazz) {
		File file = null;

		try {
			file = new File(clazz.getProtectionDomain().getCodeSource().getLocation().toURI());
		} catch (URISyntaxException e) {}

		return file;
	}

	/**
	 * Lists the contents of a zip file.
	 *
	 * @since 1.0
	 * @param zipFile the zip file to use
	 * @return the contents of the zip file
	 * @throws IOException if an I/O error has occurred
	 */
	public static List<String> listZipContents(File zipFile) throws IOException {
		return listZipContents(zipFile, "");
	}

	/**
	 * Lists the contents of a zip file.
	 * Only looks in the supplied path within the zip file.
	 *
	 * @since 1.0
	 * @param zipFile the zip file to use
	 * @param path the path inside the jar file
	 * @return the contents of the zip file
	 * @throws IOException if an I/O error has occurred
	 */
	public static List<String> listZipContents(File zipFile, String path) throws IOException {

		List<String> names = new ArrayList<>();

		if(zipFile.isFile()) {
			ZipFile zip = null;
			try {
				zip = new ZipFile(zipFile);
				Enumeration<? extends ZipEntry> entries = zip.entries();
				while (entries.hasMoreElements()) {
					ZipEntry entry = entries.nextElement();
					String name = entry.getName();
					if (!entry.isDirectory() && name.startsWith(path)) {
						names.add(name);
					}
				}
			} finally {
				close(zip);
			}
		}

		return names;
	}
	
}
