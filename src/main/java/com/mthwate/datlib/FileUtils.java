package com.mthwate.datlib;

import com.mthwate.datlib.fileprocessor.FileCollectionProcessor;
import com.mthwate.datlib.fileprocessor.FileProcessor;

import java.io.File;
import java.util.List;

/**
 * @author mthwate
 * @since 1.0
 */
public class FileUtils {

	public static List<File> listFilesRecursive(File dir) {
		FileCollectionProcessor processor = new FileCollectionProcessor();
		traverseDirectory(processor, dir);
		return processor.getFiles();
	}

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
