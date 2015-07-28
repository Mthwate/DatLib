package com.mthwate.datlib.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mthwate
 * @since 1.2
 */
public class FileCollectionVisitor<T> extends SimpleFileVisitor<T> {

	private List<T> files = new ArrayList<>();

	public List<T> getFiles() {
		return files;
	}

	@Override
	public FileVisitResult visitFile(T file, BasicFileAttributes attrs) throws IOException {
		FileVisitResult result = super.visitFile(file, attrs);
		files.add(file);
		return result;
	}
}
