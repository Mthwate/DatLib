package com.mthwate.datlib.fileprocessor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * A {@link FileProcessor} which collects all {@link File} objects it finds.
 *
 * @author mthwate
 * @since 1.0
 */
public class FileCollectionProcessor implements FileProcessor {

	private List<File> files = new ArrayList();

	public List<File> getFiles() {
		return files;
	}

	@Override
	public void onFile(File file) {
		files.add(file);
	}

	@Override
	public void onDirectory(File directory) {}

}
