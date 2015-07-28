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
public class DirectoryCollectionVisitor<T> extends SimpleFileVisitor<T> {

	private List<T> directories = new ArrayList<>();

	public List<T> getDirectories() {
		return directories;
	}

	@Override
	public FileVisitResult preVisitDirectory(T dir, BasicFileAttributes attrs) throws IOException {
		FileVisitResult result = super.preVisitDirectory(dir, attrs);
		directories.add(dir);
		return result;
	}

}
