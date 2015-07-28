package com.mthwate.datlib.fileprocessor;

import com.mthwate.datlib.filevisitor.FileCollectionVisitor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * A {@link FileProcessor} which collects a list of all files it finds.
 *
 * @author mthwate
 * @since 1.0
 * @deprecated use {@link FileCollectionVisitor} instead
 */
@Deprecated
public class FileCollectionProcessor implements FileProcessor {

	private List<File> files = new ArrayList<>();

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
