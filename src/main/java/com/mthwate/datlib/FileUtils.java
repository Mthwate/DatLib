package com.mthwate.datlib;


import com.mthwate.datlib.filevisitor.FileCollectionVisitor;

import java.io.File;
import java.io.IOException;
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

}
