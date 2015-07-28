package com.mthwate.datlib;

import com.mthwate.datlib.fileprocessor.FileProcessor;
import com.mthwate.datlib.filevisitor.FileCollectionVisitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * @author mthwate
 * @since 1.0
 */
public class FileUtils {

	public static List<Path> listFilesRecursive(File dir) throws IOException {
		FileCollectionVisitor<Path> visitor = new FileCollectionVisitor<>();
		Files.walkFileTree(dir.toPath(), visitor);
		return visitor.getFiles();
	}

	/**
	 * @deprecated use {@link Files#walkFileTree(Path, FileVisitor)} instead
	 */
	@Deprecated
	public static void traverseDirectory(FileProcessor processor, File dir) {
		if (dir.isDirectory()) {
			processor.onDirectory(dir);
			for (File content : dir.listFiles()) {
				traverseDirectory(processor, content);
			}
		} else {
			processor.onFile(dir);
		}
	}

}
