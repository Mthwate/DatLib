package com.mthwate.datlib.fileprocessor;

import java.io.File;

/**
 * An object which processes files it comes in contact with.
 * The way it finds these files is dependent on the function it is used in,
 *
 * @author mthwate
 * @since 1.0
 */
public interface FileProcessor {

	void onFile(File file);

	void onDirectory(File directory);

}
