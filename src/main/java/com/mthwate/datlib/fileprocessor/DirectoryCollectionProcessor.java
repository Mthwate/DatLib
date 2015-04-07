package com.mthwate.datlib.fileprocessor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * A {@link FileProcessor} which collects a list of all directories it finds.
 *
 * @author mthwate
 * @since 1.0
 */
public class DirectoryCollectionProcessor implements FileProcessor {

	private List<File> directories = new ArrayList();

	public List<File> getDirectories() {
		return directories;
	}

	@Override
	public void onFile(File file) {}

	@Override
	public void onDirectory(File directory) {
		directories.add(directory);
	}

}
