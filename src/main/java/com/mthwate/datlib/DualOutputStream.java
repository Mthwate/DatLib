package com.mthwate.datlib;

import java.io.IOException;
import java.io.OutputStream;

/**
 * An output stream that writes to 2 other output streams at once.
 *
 * @author mthwate
 * @since 1.0
 */
public class DualOutputStream extends OutputStream {

	private OutputStream s1;
	
	private OutputStream s2;
	
	public DualOutputStream(OutputStream s1, OutputStream s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void write(int i) throws IOException {
		s1.write(i);
		s2.write(i);
	}
	
}
